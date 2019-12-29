import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class dane {
    public static ArrayList<kawa> DownloadDatabase() throws FileNotFoundException {
        File file=new File("C:\\Users\\ogole\\Desktop\\System Ekspercki\\src\\kawy.txt");
        Scanner in=new Scanner(file);
        ArrayList<kawa> lista = new ArrayList<>();
        String coffe;
        String[] array;
        while(in.hasNextLine()) {
            coffe = in.nextLine();
            array = coffe.split(",");
            kawa c = new kawa(array[0], array[1], array[2], array[3], array[4], array[5]);
            lista.add(c);
        }
        return lista;

    }
}
