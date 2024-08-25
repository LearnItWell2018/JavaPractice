package com.collection.all.exercise;

import java.security.Key;
import java.sql.Array;
import java.util.*;

public class FilterParagraph {

    public static String paragraph = "Many of the best known events in Indonesian history took place on Java. It was the centre of powerful Hindu-Buddhist empires, the Islamic sultanates, and the core of the colonial Dutch East Indies. Java was also the center of the Indonesian struggle for independence during the 1930s and 1940s. Java dominates Indonesia politically, economically and culturally. Four of Indonesia's eight UNESCO world heritage sites are located in Java: Ujung Kulon National Park, Borobudur Temple, Prambanan Temple, and Sangiran Early Man Site." +

            "Java was formed by volcanic eruptions due to geologic subduction of the Australian Plate under the Sunda Plate. It is the 13th largest island in the world and the fifth largest in Indonesia by landmass, at about 132,011.65 square kilometres (50,969.98 sq mi) (including Madura's 5,408.45 square kilometres (2,088.21 sq mi)). A chain of volcanic mountains is the east–west spine of the island." +

            "Four main languages are spoken on the island: Javanese, Sundanese, Madurese, and Betawi. Javanese and Sundanese are the most spoken.[3] The ethnic groups native to the island are the Javanese in the central and eastern parts and Sundanese in the western parts. The Madurese in the Eastern salient of Java are migrants from Madura Island, while the Betawi in the capital city of Jakarta are hybrids from various ethnic groups in Indonesia. Most residents are bilingual, speaking Indonesian (the official language of Indonesia) as their first or second language. While the majority of the people of Java are Muslim, Java's population comprises people of diverse religious beliefs, ethnicities, and cultures.[4]" +

            "Java is divided into four administrative provinces: Banten, West Java, Central Java, and East Java, and two special regions, Jakarta and Yogyakarta.";

    public static void sort(String [] paragraph){
        for(int i =0; i< paragraph.length;i++){
            for(int j=i+1; j< paragraph.length-1;j++){
                if(paragraph[i].compareTo(paragraph[j])>0){
                    String temp = paragraph[i];
                    paragraph[i]=paragraph[j];
                    paragraph[j]=temp;
                }
            }
        }
    }
    public static void printArray(String[] paragraph){
        for(int i =0; i < paragraph.length;i++){
            System.out.println(paragraph[i]+ " ");
        }
    }




    public static void main(String[] args) {
        //System.out.println(paragraph);
        paragraph = paragraph.replaceAll(";","");
        paragraph = paragraph.replaceAll(",","");
        paragraph = paragraph.replaceAll("\\.","");
        paragraph = paragraph.replaceAll(":","");
        System.out.println(paragraph);

        String[] words = paragraph.split(" ");

        HashMap<String, Integer> map = new HashMap<String, Integer>();


        for (String word : words) {
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }else{
                map.put(word,1);

            }

        }


        System.out.println(map);

        Arrays.sort(words,String.CASE_INSENSITIVE_ORDER);

        System.out.println("Words in alphabetical order");
        for(String word : words){
            System.out.println(word);
        }


    }
}









