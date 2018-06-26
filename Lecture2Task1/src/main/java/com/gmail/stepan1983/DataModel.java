package com.gmail.stepan1983;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface DataModel {

    public  void addUserToDataBase(User us);
    public  void addUserStatsToDataBase(User us, ArrayList<String> answers);

    public Map<User,List<String>> getGeneralUserStats();
    public List<String> getUserStats(User us);
    public Map<Integer, Map<String,Integer>> getGeneralQuestionStats();

}
