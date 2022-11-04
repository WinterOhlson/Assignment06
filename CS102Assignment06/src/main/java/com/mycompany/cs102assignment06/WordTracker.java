/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cs102assignment06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author jehuv
 */
public class WordTracker {
    public static ArrayList<String> readFile(String fileName)
    {
        ArrayList<String> stringList = new ArrayList<>();
        try {
            File textFile = new File(fileName);
            Scanner s = new Scanner(textFile);
            while(s.hasNextLine())
            {
                String fullLine = s.nextLine();
                int begin = 0;
                int end = fullLine.length();
                for(int i = 0; i < fullLine.length(); i++)
                {
                    String rawString;
                    if(fullLine.charAt(i) == ' ')
                    {
                        rawString = fullLine.substring(begin, i);
                        begin = i + 1;
                        String refinedString = "";
                        for(int k = 0; k < rawString.length(); k++)
                        {
                            int charValue = (int) rawString.charAt(k);
                            if(charValue >= 97 && charValue <= 122)
                            {
                                refinedString += rawString.charAt(k);
                            }
                            else if(charValue >= 65 && charValue <= 90)
                            {
                                refinedString += (char) (charValue + 32);
                            }
                        }
                        stringList.add(refinedString);
                    }
                }
                String rawString = fullLine.substring(begin, end);
                String refinedString = "";
                for(int k = 0; k < rawString.length(); k++)
                {
                    int charValue = (int) rawString.charAt(k);
                    if(charValue >= 97 && charValue <= 122)
                    {
                        refinedString += rawString.charAt(k);
                    }
                    else if(charValue >= 65 && charValue <= 90)
                    {
                        refinedString += (char) (charValue + 32);
                    }
                }
                stringList.add(refinedString);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
        return stringList;
    }
    
    public static int countUnique(String fileName)
    {
        HashSet<String> lyricSet = new HashSet<>();
        ArrayList<String> lyricList = readFile(fileName);
        for(int i = 0; i < lyricList.size(); i++)
        {
            lyricSet.add(lyricList.get(i));
        }
        return lyricSet.size();
    }
    
    public static int countWord(String word, String fileName)
    {
        int count = 0;
        String refinedWord = "";
        for(int i = 0; i < word.length(); i++)
        {
            int charValue = (int) word.charAt(i);
            if(charValue >= 65 && charValue <= 90)
            {
                refinedWord += (char) (charValue + 32);
            }
            else if(charValue >= 97 && charValue <= 122)
            {
                refinedWord += (char) (charValue);
            }
        }
        ArrayList<String> lyricList = readFile(fileName);
        for(int i = 0; i < lyricList.size(); i++)
        {
            if(lyricList.get(i).equals(refinedWord))
            {
                count++;
            }
        }
        return count;
    }
}
