
public class Encrypt {
    public static StringBuilder encrypter(String story, ,int shift){
        StringBuilder encResult = new StringBuilder();

        for (int i=0; i<story.length(); i++){
            if(Character.isUpperCase(story.charAt(i)))
            {
                char character =(char)(((int)story.charAt(i)+
                        shift-65)%26 + 65);
            }
        }
    }
}
