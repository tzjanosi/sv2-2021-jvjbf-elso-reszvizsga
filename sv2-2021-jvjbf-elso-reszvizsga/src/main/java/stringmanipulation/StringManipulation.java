package stringmanipulation;

public class StringManipulation {
    public StringBuilder everyEvenCharacter(String s){
        StringBuilder output = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            if(i%2==0){
                output.append(s.charAt(i));
            }
        }
        return output;
    }
}