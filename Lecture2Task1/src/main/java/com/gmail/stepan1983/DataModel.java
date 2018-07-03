package com.gmail.stepan1983;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface DataModel {

      void addUserToDataBase(User us);
      void addUserStatsToDataBase(User us, ArrayList<String> answers);

     Map<User,ArrayList<String>> getGeneralUserStats();
     List<String> getUserStats(User us);
     Map<Integer, Map<String,Integer>> getGeneralQuestionStats();

}
