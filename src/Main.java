import java.util.Scanner;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);
        Boolean exit = false;
        String message;
        String method;
        String output;

        Cryto cryto = new Cryto();

        System.out.println("Inserisci un messaggio da cifrare o decifrare:");
        message = keyInput.nextLine();
        
        do{
            System.out.println("Scegli il tipo di algoritmo: (C = cifrario di cesare; X = metodo XOR)");
            method = keyInput.nextLine();
            method = method.toLowerCase();
        } while(method == "c" && method == "x");

        switch (method) {
            case "c":
                System.out.print("Inserisci l'intervallo di cifratura: ");
                int shifter = keyInput.nextInt();
                keyInput.nextLine();

                output = cryto.Cesar(message, shifter);

                System.out.println("Messaggio trasformato: " + output);
                System.out.println("Messaggio originale: " + cryto.Cesar(output, (0-shifter)));
                break;
        
            case "x":
                System.out.print("Inserisci la chiave di cifratura: ");
                String key = keyInput.nextLine();

                output = cryto.xorAlgo(message, key);

                System.out.println("Messaggio trasformato: " + output);
                System.out.println("Messaggio originale: " + cryto.xorAlgo(output, key));
                break;
        }
    }
}

