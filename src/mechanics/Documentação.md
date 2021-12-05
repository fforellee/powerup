## IMPORTANTE

## Resumo do funcionamento principal

- O jogador escolhe e utiliza 3 cartas. 
- Após 3 cartas serem utilizadas, o loop das cartas quebra e o dano total é computado.
- O inimigo sofre o dano computado.
                 
if (dano total >= hp do inimigo) {
    avisa que o jogador derrotou o inimigo, aumenta seu score (baseado no hp do inimigo, 5 no primeiro andar),
    e o leva pro próximo andar
}

else {
    o inimigo da dano fixo (baseado em sua criação, 5 no primeiro andar) no hp do jogador,
    e o jogo repete o sistema acima até o inimigo ser derrotado, ou o hp do jogador chegar a 0.

    if (hp do jogador <= 0) {
        chama uma função de game over, reseta todas as variáveis globais e o andar.
    }
}

------------------------------------------------------------------------------------------------------------------

## Loop do uso de cartas

Enquanto a quantidade de cartas usadas for menor que 3, pede-se uma carta ao jogador.

Utiliza a carta e a remove da Mão.

 while (Global.usedCards < 3) {
    System.out.println("\nMão: " + Hand);
    System.out.print("\nEscolha uma carta por seu número: ");
    userChoice = in.nextInt();
                 
    System.out.println("\nVocê utilizou a carta " + Hand.chosenCard(userChoice).name + "!");
    System.out.println("\n" + Hand.chosenCard(userChoice).description);
                 
    Hand.chosenCard(userChoice).useCard(userChoice, Global);
    Hand.useCard(userChoice, Global);
}
                 
------------------------------------------------------------------------------------------------------------------

## O que deve ser mostrado a começar um novo andar
                 
System.out.println("\n----- 2° Andar -----");
 
System.out.println("\n[!] Ao subir de andar, novas cartas surgem misteriosamente em suas mãos...");
 
Hand.fillHand(Deck);
 
System.out.println("\n[?] Você sente uma espécie de déjà vu, mas decide ignorar essa sensação.");
 
System.out.println("\nEsta é sua nova mão: " + Hand);

------------------------------------------------------------------------------------------------------------------

      