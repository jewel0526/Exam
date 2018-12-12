package src.problems;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

            String input="Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language"; 		//Input String
            String[] words=input.split(" ");
            int wrc=1;

            for(int i=0;i<words.length;i++)
            {
                for(int j=i+1;j<words.length;j++)
                {

                    if(words[i].equals(words[j]))
                    {
                        wrc=wrc+1;
                        words[j]="0";
                    }
                }
                if(words[i]!="0")
                    System.out.println(words[i]+"--"+wrc);
                wrc=1;

            }

        }

    }





