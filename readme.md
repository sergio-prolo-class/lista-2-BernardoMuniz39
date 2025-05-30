[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/KKrNRA9P)

# Engenharia de Telecomunicações - Programação Orientada a Objetos
## Bernardo Souza Muniz - Lista de exercícios 2

### Como usar o repositório
Para clonar o repositório para a sua máquina local utilizando Git, basta executar o seguinte comando no seu terminal:

`git clone https://github.com/sergio-prolo-class/lista-2-BernardoMuniz39`

### Sobre
Este repositório tem o objetivo de apresentar a resolução da lista 2 da disciplina de Programação orientada a objetos. Durante a realização do projeto, foi utilizada a biblioteca **algs4** para desenhar os tabuleiros em questão.

Para utilizar o projeto, certifique-se de estar dentro da pasta clonada e com o gradle instalado no seu computador. Digite o seguinte comando no terminal da sua máquina local:

`gradle run` ou `./gradlew run`

OBS: Caso após a execução do comando acima aparecer um aviso de permissão negada, basta executar o comando: `chmod +x gradlew` e digitar e utilizar novamente o projeto com `./gradlew run`.

Fique a vontade para imprimir novos tabuleiros, navios e desenhar conforme sua curiosidade!

### Classe Grade
A classe grade é utilizada para desenhar um novo tabuleiro em na tela, sendo possível posicionar ele em determinado lugar tomando como base as coordenadas positivas de uma plano cartesiano de eixo X e Y. 

A grade é baseada no tabuleiro do jogo Batalha naval, com um tamanho padrão de 10x10 e com posições variando de A até J na vertical e de 0 até 9 na horizontal.

Para criar uma grade você deve informar as posições XY que ficarão dentro da tela. Se caso for informado uma posição negativa, o programa vai ser interrompido.

É possível definir o tamanho de cada quadrado dentro do tabuleiro através o método setPixel(). Quanto maior o pixel de cada quadrado maior ficará o tabuleiro. Foi definido um tamanho inicial de 40 pixels, mas que pode ser ajustado conforma a necessidade.

Abaixo está a descrição de cada método da classe Grade:
- Grade(): Cria um novo tabuleiro com posições XY dentro da tela Draw;
- setPixel(): Define o tamanho de cada quadrado do tabuleiro;
- desenhar(): Desenha um novo tabuleiro na tela;
- getPosX(): Retorna a posição X do tabuleiro dentro da tela;
- getPosY(): Retorna a posição Y do tabuleiro dentro da tela;
- getPixel(): Retorna o pixel dos quadrados presentes no tabuleiro; 

### Classe Navio
A classe Navio é utilizada para inserir navios dentro dos tabuleiros presentes na tela em determinada linha e coluna da grade.

Para desenhar um navio é necessário informar as linhas/coluna na qual o navio será inserido, a quantidade de navios desejada, a orientação dos navios (vertical/horizontal), a grade e a tela a ser inserida.

Vale ressaltar que ao indicar uma linha, você deve tomar como parâmetro que a linha 0 é a primeira linha olhando de cima para baixo do tabuleiro. Ambas linhas e colunas tem valores de 0 até 9, totalizando 10 linhas e 10 colunas.

Não é permitido colocar navios na tabuleiro em posições que ficariam fora do tabuleiro.

Abaixo está a descrição de cada método da classe Navio:
- desenhar(): Insere um novo navio no tabuleiro. Os parâmetros desse método são, respectivamente: colunas, linha, quantidade de navios a serem inseridos, orientação (vertical ou  horizontal), a grade a qual esse navion esse pertence e tela a qual o navio pertence.
- getQuantidade(): Retorna a quantidade de determinado navio presente na grade;
- getOrientacao(): Retorna a orientação de determinado navio presente na grade;

