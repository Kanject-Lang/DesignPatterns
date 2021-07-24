package memento.exercise;

import memento.exercise.game.Gamer;
import memento.exercise.game.Memento;

import java.io.*;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class Main {
    public static final String SAVE_FILE_NAME = "other\\game.dat";
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = loadMemento();
//        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);
            System.out.println("当前状态：" + gamer);

            gamer.bet();

            System.out.println("所持金钱为" + gamer.getMoney() + "元。");
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("   （所持金钱增加了许多，因此保存游戏当前的状态）");
                memento = gamer.createMemento();
                saveMemento(memento);
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("   （所持金钱减少了许多，因此将游戏恢复至以前的状态）");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");
        }
    }

    private static void saveMemento(Memento memento) {
        try {
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream(SAVE_FILE_NAME));
//            ObjectOutput out = new ObjectOutputStream(new DeflaterOutputStream(new FileOutputStream(SAVE_FILE_NAME)));
            out.writeObject(memento);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Memento loadMemento() {
        Memento memento = null;

        try {
            ObjectInput in = new ObjectInputStream(new FileInputStream(SAVE_FILE_NAME));
//            ObjectInput in = new ObjectInputStream(new InflaterInputStream(new FileInputStream(SAVE_FILE_NAME)));
            memento = (Memento) in.readObject();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return memento;
    }
}
