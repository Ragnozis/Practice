package Task54;
/*
In the card game poker, a hand consists of five cards and are ranked, from lowest to highest, in the following way:

High Card: Highest value card.
One Pair: Two cards of the same value.
Two Pairs: Two different pairs.
Three of a Kind: Three cards of the same value.
Straight: All cards are consecutive values.
Flush: All cards of the same suit.
Full House: Three of a kind and a pair.
Four of a Kind: Four cards of the same value.
Straight Flush: All cards are consecutive values of same suit.
Royal Flush: Ten, Jack, Queen, King, Ace, in same suit.

The cards are valued in the order:
2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, Ace.

If two players have the same ranked hands then the rank made up of the highest value wins;
for example, a pair of eights beats a pair of fives (see example 1 below).
But if two ranks tie, for example, both players have a pair of queens,
then highest cards in each hand are compared (see example 4 below);
 if the highest cards tie then the next highest cards are compared, and so on.

Consider the following five hands dealt to two players:

Hand	 	Player 1	 	Player 2	       	     Winner
1	 	5H 5C 6S 7S KD     2C 3S 8S 8D TD           Player 2
        Pair of Fives       Pair of Eights
2	 	5D 8C 9S JS AC      2C 5C 7D 8S QH        	Player 1
        Highest card Ace    Highest card Queen
3	 	2D 9C AS AH AC        3D 6D 7D TD QD      	Player 2
           Three Aces         Flush with Diamonds
4	 	4D 6S 9H QH QC       	3D 6D 7H QD QS     	Player 1
        Pair of Queens            Pair of Queens
        Highest card Nine        Highest card Seven
5	 	2H 2D 4C 4D 4S         	3C 3D 3S 9S 9D  	Player 1
          Full House               Full House
        With Three Fours          with Three Threes

The file, poker.txt, contains one-thousand random hands dealt to two players.
Each line of the file contains ten cards (separated by a single space):
the first five are Player 1's cards and the last five are Player 2's cards.
You can assume that all hands are valid (no invalid characters or repeated cards),
each player's hand is in no specific order, and in each hand there is a clear winner.

How many hands does Player 1 win?
 */
import Task22.Task22;

public class Task54 {
    static char[] card_values= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M'};
    static char[] card_suits = {'Ж','Ч','Б','П'};

    public static int whoWinPokerGame(String poker_game)
    {
        int answer = 0;
        char[] poker_game_array = poker_game.toCharArray();
        String player1_hand = "";
        String player2_hand = "";
        char[] player1_hand_array = player1_hand.toCharArray();
        char[] player2_hand_array = player2_hand.toCharArray();
        int score1 = 0;
        int score2 = 0;
        String score1_st ="";
        String score2_st ="";
        for (int i = 0; i < poker_game_array.length; i++)
        {
            if(i<15) {
                player1_hand = player1_hand + poker_game_array[i];
            }
            else {
                player2_hand = player2_hand + poker_game_array[i];
            }
        }
        score1 = highCard(player1_hand);
        score2 = highCard(player2_hand);
        score1_st = cardRepeats(player1_hand);
        score2_st = cardRepeats(player2_hand);
        if(score1 < set(player1_hand)) score1 = set(player1_hand);
        if(score2 < set(player2_hand)) score2 = set(player2_hand);
        if(score1 < straight(player1_hand)) score1 = straight(player1_hand);
        if(score2 < straight(player2_hand)) score2 = straight(player2_hand);
        if(score1 < flush(player1_hand)) score1 = flush(player1_hand);
        if(score2 < flush(player2_hand)) score2 = flush(player2_hand);
        if(score1 < fullHouse(player1_hand)) score1 = fullHouse(player1_hand);
        if(score2 < fullHouse(player2_hand)) score2 = fullHouse(player2_hand);
        if(score1 < quads(player1_hand)) score1 = quads(player1_hand);
        if(score2 < quads(player2_hand)) score2 = quads(player2_hand);
        if(score1 < straightFlush(player1_hand)) score1 = straightFlush(player1_hand);
        if(score2 < straightFlush(player2_hand)) score2 = straightFlush(player2_hand);
        if(score1 < royalFlush(player1_hand)) score1 = royalFlush(player1_hand);
        if(score2 < royalFlush(player2_hand)) score2 = royalFlush(player2_hand);

        if(score1 > 16 && score1 > score2 ) answer = 1;
        if (score2 > 16 && score1 < score2) answer = 2;
        if(score1 < 16 && score2 < 16 && score1_st.compareTo(score2_st) > 0) answer = 1;
        if(score1 < 16 && score2 < 16 && score1_st.compareTo(score2_st) < 0) answer = 2;
        if(score1 < 16 && score2 < 16 && score1_st.compareTo(score2_st) == 0 && score1 > score2) answer = 1;
        if(score1 < 16 && score2 < 16 && score1_st.compareTo(score2_st) == 0 && score1 < score2) answer = 2;

        return answer;
    }
    public static int highCard(String player_hand)
    {
        char[] player_hand_array = player_hand.toCharArray();
        int max = 0;
        for(int i = 0; i < player_hand_array.length; i=i+3)
        {
           if(player_hand_array[i]-64 > max) max = player_hand_array[i]-64;
        }
        return max;
    }
    public static String cardRepeats(String player_hand)
    {
        String answer = "";
        int count = 0;
        char remember1 = ' ';
        char remember2 = ' ';
        for(int i = card_values.length-1; i>=0; i--) {
            if (player_hand.length() - player_hand.replace(String.valueOf(card_values[i]), "").length() == 2) {
                count++;
                if (count == 1) remember1 = card_values[i];
                if (count == 2) remember2 = card_values[i];

            }
        }
        if(count == 1) answer = "1Pair" + remember1;
        if(count == 2) answer = "2Pairs" + remember1 + remember2;
        return answer;
    

     }
     public static int set(String player_hand)
     {
         int answer = 0;
         for(int i = card_values.length-1; i>=0; i--) {
             if (player_hand.length() - player_hand.replace(String.valueOf(card_values[i]), "").length() == 3) {
                 answer = 20 + (card_values[i] - 64);
             }
         }
         return answer;
     }
     public static int straight(String player_hand)
     {
         int answer = 0;
         int count = 0;
         int remember = 0;
         for(int i = card_values.length-1; i>=0; i--) {
             count++;
             if (player_hand.length() - player_hand.replace(String.valueOf(card_values[i]), "").length() != 1) {
                 count = 0;
             }
             if(count == 5 )
             {
                 remember = card_values[i];
                 break;
             }
         }
         if(count == 5) answer = 40 + (remember - 64);
         return answer;

     }
     public static int flush(String player_hand)
     {
         int answer = 0;
         for(int i = card_suits.length-1; i>=0; i--) {
             if (player_hand.length() - player_hand.replace(String.valueOf(card_suits[i]), "").length() == 5) answer = 60;
         }
         return answer;
     }
     public static int fullHouse(String player_hand)
     {
         int answer = 0;
         int count = 0;
         int remember = 0;
         for(int i = card_values.length-1; i>=0; i--) {
             if (player_hand.length() - player_hand.replace(String.valueOf(card_values[i]), "").length() == 3) {
                 remember = card_values[i] - 64;
                 count++;
                 continue;
             }
             if (player_hand.length() - player_hand.replace(String.valueOf(card_values[i]), "").length() == 2) {

                 count++;
             }
             if(count == 2 )
             {
                 answer = 80 + remember;
                 break;
             }
         }
         return answer;
     }
     public static int quads(String player_hand)
     {
         int answer = 0;
         for(int i = card_values.length-1; i>=0; i--) {
             if (player_hand.length() - player_hand.replace(String.valueOf(card_values[i]), "").length() == 4) {
                 answer = 100 + (card_values[i] - 64);
             }
         }
         return answer;
     }
     public static int straightFlush(String player_hand)
     {
         int answer = 0;
         int count = 0;
         int remember = 0;
         boolean flag = false;
         for(int i = card_values.length-1; i>=0; i--) {
             count++;
             if (player_hand.length() - player_hand.replace(String.valueOf(card_values[i]), "").length() != 1) {
                 count = 0;
             }
             if(count == 5 )
             {
                 remember = card_values[i];
                 flag = true;
                 break;
             }
         }
         if(flag)
         {
             for(int j = 0; j< card_suits.length;j++)
             {
                 if (player_hand.length() - player_hand.replace(String.valueOf(card_suits[j]), "").length() == 5)
                     answer = 120 + (remember - 64);

             }

         }
         return answer;

     }
     public static int royalFlush(String player_hand)
     {
         int answer = 0;
         int count = 0;
         int remember = 0;
         boolean flag = false;
         for(int i = card_values.length-1; i>=7; i--) {
             count++;
             if (player_hand.length() - player_hand.replace(String.valueOf(card_values[i]), "").length() != 1) {
                 count = 0;
             }
             if(count == 5 )
             {
                 remember = card_values[i];
                 flag = true;
                 break;
             }
         }
         if(flag)
         {
             for(int j = 0; j< card_suits.length;j++)
             {
                 if (player_hand.length() - player_hand.replace(String.valueOf(card_suits[j]), "").length() == 5)
                     answer = 1000;

             }

         }
         return answer;
     }
    public static void main(String[] args)
    {
        String poker_combinations = "";
        int player1_wins = 0;
        int player2_wins = 0;
        String file_name = "C:\\Users\\admin\\Downloads\\0054_poker.txt";
        poker_combinations = Task22.readFile(file_name);
        poker_combinations = poker_combinations.replace('A','M');
        poker_combinations = poker_combinations.replace('K','L');
        poker_combinations = poker_combinations.replace('C','Ж');
        poker_combinations = poker_combinations.replace('H','Ч');
        poker_combinations = poker_combinations.replace('D','Б');
        poker_combinations = poker_combinations.replace('S','П');
        poker_combinations = poker_combinations.replace('2','A');
        poker_combinations = poker_combinations.replace('3','B');
        poker_combinations = poker_combinations.replace('4','C');
        poker_combinations = poker_combinations.replace('5','D');
        poker_combinations = poker_combinations.replace('6','E');
        poker_combinations = poker_combinations.replace('7','F');
        poker_combinations = poker_combinations.replace('8','G');
        poker_combinations = poker_combinations.replace('9','H');
        poker_combinations = poker_combinations.replace('T','I');
        poker_combinations = poker_combinations.replace('Q','K');


        String[] poker_games = poker_combinations.split("\n");
        System.out.println(poker_games.length);
        for(int i = 0; i <= poker_games.length-1;i++)
        {
            if(whoWinPokerGame(poker_games[i]) == 1) player1_wins++;
            if(whoWinPokerGame(poker_games[i]) == 2) player2_wins++;
        }
        System.out.println(player1_wins);
        System.out.println(player2_wins);
    }
}
