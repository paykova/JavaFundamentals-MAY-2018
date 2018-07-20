package p02_WarningLevels;


import java.util.ArrayList;
import java.util.List;

public class Logger {

   private List<Message> messages;
   private Importance importance;

    public Logger(String importance) {
        this.importance = Importance.valueOf(Importance.class, importance.toUpperCase());
        this.messages = new ArrayList<>();
    }

    public void addMessage(String importance, String message){
      Importance imp = Importance.valueOf(Importance.class, importance.toUpperCase());
      if(imp.compareTo(this.importance) >= 0){
          this.messages.add(new Message(importance, message));
      }
    }

    public Iterable<Message> getMessages(){
        return this.messages;
    }
}
