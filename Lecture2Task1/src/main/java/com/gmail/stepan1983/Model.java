package com.gmail.stepan1983;

import java.io.Serializable;
import java.util.*;

public class Model implements DataModel, Serializable {

    private static Map<User, List<String>> stats = new TreeMap<>((User us1, User us2) -> us1.getName().compareToIgnoreCase(us2.getName()));

    private static Map<String, Integer> questioun1Stats = new TreeMap<>();
    private static Map<String, Integer> questioun2Stats = new TreeMap<>();
    private static Map<String, Integer> questioun3Stats = new TreeMap<>();

    private static List<Map<String, Integer>> qeustionStatsList=new ArrayList<>();


    private Map<Integer,Map<String,Integer>> statsQuestion=new TreeMap<>();

    @Override
    public void addUserToDataBase(User us) {
        stats.put(us, new ArrayList<String>());
    }

    @Override
    public void addUserStatsToDataBase(User us, ArrayList<String> answers) {
        stats.put(us, answers);
        String[] answ=new String[3];
        answ=answers.toArray(new String[3]);
            int temp=0;
        for (int i = 0; i < 2; i++) {
            if(!statsQuestion.containsKey(i)){
                statsQuestion.put(i,new TreeMap<String, Integer>());
            }
            for (int j = 0; j <answ.length-1; j++) {
                if(!statsQuestion.get(i).containsKey(answers.get(j))){
                    statsQuestion.get(i).put(answers.get(j),temp++);
                }

            }

        }

    }

    @Override
    public Map<User, List<String>> getGeneralUserStats() {
        return stats;
    }

    @Override
    public List<String> getUserStats(User us) {
        return stats.get(us);
    }

    @Override
    public Map<Integer, Map<String, Integer>> getGeneralQuestionStats() {

        for (int i = 0; i <2 ; i++) {
            
        }

        return null;
    }


}
