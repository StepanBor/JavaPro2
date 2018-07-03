package com.gmail.stepan1983;

import java.io.Serializable;
import java.util.*;

public class Model implements DataModel, Serializable {

    private static Map<User, ArrayList<String>> stats = new TreeMap<>((User us1, User us2) -> us1.getName().compareToIgnoreCase(us2.getName()));
    private static Map<Integer, Map<String, Integer>> statsQuestion = new TreeMap<>();






    @Override
    public synchronized void addUserToDataBase(User us) {
        stats.put(us, new ArrayList<String>());
    }

    @Override
    public synchronized void addUserStatsToDataBase(User us, ArrayList<String> answers) {

        stats.put(us, new ArrayList<String>(answers));


        int temp = 0;
        TreeMap<String, Integer> tempMap=new TreeMap<>();
        Character chTemp='A';
        for (int i = 0; i < 3; i++) {
            String stTemp="";
            tempMap.put(stTemp+(char)(chTemp+i)+" ",0);
        }
        for (int i = 0; i < 3; i++) {
            if (!statsQuestion.containsKey(i)) {
                statsQuestion.put(i, new TreeMap<>(tempMap));
            }

            for (int j=0; j<answers.size();j++) {
                if (statsQuestion.get(i).containsKey(answers.get(j))) {

                    statsQuestion.get(i).put(answers.get(j), (statsQuestion.get(i).get(answers.get(j)) + 1));
                    answers.remove(j);
                    break;


                }
            }




        }

    }

    @Override
    public Map<User, ArrayList<String>> getGeneralUserStats() {
        System.out.println(stats+" from object model");
        return stats;
    }

    @Override
    public List<String> getUserStats(User us) {
        return stats.get(us);
    }

    @Override
    public Map<Integer, Map<String, Integer>> getGeneralQuestionStats() {

       return statsQuestion;
    }


}
