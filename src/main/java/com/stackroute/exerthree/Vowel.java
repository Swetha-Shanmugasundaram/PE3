package com.stackroute.exerthree;

public class Vowel {

        String[] removeVowels(String[] arr1)
        {

            String [] arr2=new String[arr1.length];

            for(int i = 0; i<arr1.length; i++)
            {
                char[] c=arr1[i].toCharArray();
                String temp="";
                temp+=c[0];
                for(int j=1;j<c.length;j++)
                {

                    if(!(c[j]=='A'|| c[j]=='E' || c[j]=='I' || c[j]=='O' || c[j]=='U'|| c[j]=='a'||c[j]=='e'||c[j]=='i'||c[j]=='o'||c[j]=='u'))
                    {

                        temp += c[j];
                    }
                }
                arr2[i]=temp;
                System.out.println(arr2[i]);
            }

            return arr2;
        }
    }

