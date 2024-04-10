package org.derryfield.toys;

public class Magic8Ball {

    private String question;

    private int eightBallState;

    String[] answers;


    public Magic8Ball() {

    eightBallState = 0;
    answers = new String[] { "It is certain", "It is decidedly so", "Without a doubt", "Yes definitely", "You may rely on it", "As I see it, yes", "Most likely", "Outlook good", "Yes", "Signs point to yes", "Reply hazy, try again", "Ask again later", "Better not tell you now", "Cannot predict now", "Concentrate and ask again", "Don't count on it", "My reply is no", "My sources say no", "Outlook not so good", "Very doubtful" };

    }

    public void shake() { 
        //get random number to set state

        int randomNumber = (int) (Math.random() * 20) + 1;
        eightBallState = randomNumber;
        

    }


    public String displayAnswer() { 
        // take random number and deliver random answer
        int arrayPos = eightBallState - 1;
        return answers[arrayPos];

    }

    
    
}
