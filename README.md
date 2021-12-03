# Power UP! the Tower

> OBS: verificar as informações em monospace

`Power UP! the Tower` é um jogo de cartas no formato arcade. Seu objetivo é conquistar os `20` andares da torre, onde cada andar possui um inimigo à enfrentar, utilizando de seus cavaleiros e suas cartas mágicas. Quando derrota-se um inimigo, a tropa avança ao próximo andar, onde deve enfrentar um inimigo ainda mais poderoso!

## Resumo

- Jogo de Cartas Arcade;
- O jogo consiste entre um jogador vs maquina;
- O intuito do jogo é gerar o máximo de dano utilizando cartas mágicas que modificam o poder de cavaleiros

## Variáveis Globais

| Variável                  | Tipo  | Restrições    |
| ------------------------- | ----- | ------------- |
| Vida do Jogador           | `<int>` | 0 ≤ HP ≤ 20   |
| Pontuação do Jogador      | `<int>` | score ≥ 0     |
| Dano da Tropa, Dano total | `<int>` | danoTotal ≥ 0 |
| Quantidade de Cavaleiros  | `<int>` | qtd ≥ 1       |

## Deck `<Stack>`

Possui `60` Cartas randomicamente selecionados, remove da pilha, adiciona para a mão

## Mão `<List>`

Possui sempre 7 cartas. Pode-se utilizar até 3 cartas por andar. Ao final de cada rodada, é retirado cartas do Deck para completar a mão

## Andares `<Array[andar]>`

Contem inimigo, a cada fase reseta o dano dos cavaleiros, contudo mantem-se o numero de cavaleiros a cada 5 andares um mini boss e a cada 10 andares um boss, 20 fases ao total

### Inimigos `<Array>`

​Um array de Entidades `<Object>`, com poderes fixos determinados previamente

### Cavaleiros `<List>`

Uma lista de Entidades `<Object>` que estão presente no andar X

## Batalha

Quando Inimigo `<Array[andar]>` e Cavaleiros `<List>` se enfrentam. Soma-se o poder total de cada um.

| Condicional | Retorno                                                     |
| ----------- | ----------------------------------------------------------- |
| Se `pI > pC`  | O Jogador perde `(pI - pC)` pontos de Vida `<Global>`     |
| Se `pC > pI`  | O Jogador acumula `(pC - pI)` pontos de Score `<Global>`  |
| Se `Vida > 0` | O Jogador passa para o próximo andar                      |
| Se `Vida = 0` | O jogo termina                                            |

## Cartas `<Object>`

Contém nome `<String>`, descrição `<String>` e magia() `<function|int>`. Alteram o poder dos cavaleiros de acordo com suas magias.

### Comuns

| ID | Nome       | Descrição                        |
| -- | ---------- | -------------------------------- |
| 01 | Curar      | cavaleiros -3 \| vida +5         |
| 02 | Recrutar   | cavaleiros +2                    |
| 03 | Reunir     | danoTotal + N/2                  |
| 04 | Sacrificar | cavaleiros -1 \| poder + poder/2 |
| 05 | Treinar    | poder +1                         |