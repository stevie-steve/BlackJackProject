### README
# BLACKJACK! Homework Assignment

### Overview
This is a standard Blackjack program, lacking the nuances of a real blackjack game. The user is greeted and immediately dealt a hand.  Both cards are visible to the user, however, as is the norm in blackjack, the first card for the Dealer is not revealed. This is simulated by the term "DOWN CARD".
If the sum of Player or Dealer hand is 21, then BLACKJACK is immediately called, indicating the winner and ending the game. If both Player and Dealer get BLACKJACK, it is considered a "PASS" and the game ends in a tie.
If there is no immediate winner, the program continues.
The Player hand value is added and displayed. The user can then choose to "Hit" or "Stay". "Hit" deals another card to Player hand, adds up the value of the hand and determines if the hand is a "BUST" (over 21), in which case Player loses and the program ends. If the value is less than 22, the program loops, asking again for an input of “Hit” or “Stay”. This loop continues as long as the value is less than 22 or the player chooses “Stay”. If Player chooses “Stay the program moves on to the Dealer.
The Dealer is programmed to “Hit” if the Dealers Hand value is less than 17, and “Stay” if the value is 17 or greater. If Dealer Hand value is over 21, Dealer "Busts" and the program ends, declaring Player the winner.
If Player and Dealer both do not bust, the values are then compared, declaring the winner to the higher hand value, or "Push" if the numbers are equal.


### Applications Used

| ------ |
| GitHub/git |
| Eclipse |
| Java  |
| Terminal |



### Lessons Learned
1. I feel I was finally able to grasp some of the concepts of OOP that i was lacking in during the class week. The issue I was mostly having was the ability to call methods from different files, and keep track of where i was in the development of the program.  It was very easy to plunge down a certain path and then forget where/why I was there in the first place. I mitigated that confusion by keeping a running track on a piece of paper so I was able to refer back as for why I went in that direction in the first place.   
2. Taking breaks in not only helpful, but crucial in the development process.  On Friday,I felt so burned out from the week I decided to go for a run, get in the garden and call family. My normal breaks are about 10 minutes, but instead I walked away for a few hours. Upon my return I felt much more rejuvenated. 
3. Top continue with  trend from last week, I continue to see the value in  proper and descriptive naming conventions. While getting lost at times in the depth of the OOP constructions, I was able to look at the names of the objects and methods I was creating and realign myself properly.  Upon completion i went back and carefully changed some of the names due to their.... uniqueness.  
