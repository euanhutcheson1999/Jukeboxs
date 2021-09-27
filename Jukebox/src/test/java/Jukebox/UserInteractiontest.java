package Jukebox;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserInteractiontest {

    @Test
    @DisplayName("Test for user input")
    public void userchoice1test(){
        UserInteraction UIchoicetest = new UserInteraction();
        Album UIchoicealbumtest = new Album();
        UIchoicealbumtest.genretype();
        UIchoicetest.UIchoice1();
        assertEquals(1,"Genre", "not sure if this is right");}



    }






