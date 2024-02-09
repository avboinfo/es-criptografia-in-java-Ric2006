public class Cryto {

    static String Cesar(String data, int shift) {
        StringBuilder output = new StringBuilder(data.length());
        for (char singleChar : data.toCharArray()) {
            int shiftedChar = (int) (singleChar + shift) % 256;
            output.append((char) shiftedChar);
        }
        return output.toString();
    }

    static String xorAlgo(String data, String key) {
        int c = 0;
        StringBuilder output = new StringBuilder(data.length());
        for (char singleChar : data.toCharArray()){
            char keyChar = key.charAt(c%key.length());
            int result = (int)singleChar^(int)keyChar;
            output.append((char)result);
        }
        return output.toString();
    }
}                                     
