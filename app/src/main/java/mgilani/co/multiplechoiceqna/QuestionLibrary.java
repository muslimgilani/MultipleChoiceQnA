package mgilani.co.multiplechoiceqna;

/**
 * Created by Muslim Gilan on 04-Jan-17.
 */


public class QuestionLibrary {

    private String mQuestions[] = {
            "Which country has the largest population?",
            "Which is the largest planet in the solar system?",
            "What colour is Cyan?",
            "What are a group of dolphins called?",
            "What date was John F Kennedy assassinated?",
            "How many men have walked on the moon?",
            "What is the currency of Brazil",
            "What is the highest rank in the Australian Army",
            "How many Seas are there?",
            "What was the name given to the first super continent that was formed on earth?"





    };

    private String mChoices[][] = {
            {"India", "China", "Russia"},
            {"Jupiter", "Saturn", "Mercury"},
            {"Indigo", "Turquoise", "Violet"},
            {"Pod", "Herd", "Flock"},
            {"November 12 1962", "December 16 1999", "November 22 1963"},
            {"16", "8", "12"},
            {"Real", "Dollar", "Krona"},
            {"Lieutenant General", "Chief Of Army", "Regimental Sargent Major"},
            {"5 seas", "7 seas", "12 seas"},
            {"Gondwana", "Amasia", "Pangaea"},


    };

    private String mCorrectAnswers[] = {"China", "Jupiter", "Turquoise", "Pod", "November 22 1963", "12", "Real", "Chief Of Army", "7 seas", "Pangaea" };

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public int getQuestionCount()
    {
        return mQuestions.length;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }


}