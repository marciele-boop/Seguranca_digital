# Segurança Digital - Detector de Golpes

## Sobre o projeto

Este projeto foi desenvolvido como parte do Challenge Backend Iniciante com Java.

O objetivo do programa é analisar uma mensagem digitada pelo usuário e identificar sinais que podem indicar uma possível tentativa de golpe digital.

O programa funciona pelo terminal e foi desenvolvido em Java.

## Como funciona

1. O usuário digita uma mensagem.
2. O programa procura sinais de alerta na mensagem.
3. Cada sinal encontrado aumenta um contador.
4. O programa verifica a quantidade de sinais encontrados.
5. Se encontrar 2 ou mais sinais, informa que pode ser um possível golpe.
6. Se encontrar menos de 2 sinais, classifica a mensagem como baixo risco.

## Sinais de alerta utilizados

O programa procura pelas seguintes palavras ou expressões:

- urgente
- senha
- pix
- prêmio
- taxa
- clique aqui

## Regra de negócio

Se a mensagem possuir 2 ou mais sinais de alerta, ela será classificada como:

POSSÍVEL GOLPE

Se possuir 0 ou 1 sinal de alerta, será classificada como:

BAIXO RISCO

## Cenários de teste

### Teste 1 - Possível golpe

Mensagem:

URGENTE! Você ganhou um PRÊMIO. Clique aqui e faça um PIX para receber.

Resultado esperado:

Quantidade de sinais: 4

ATENÇÃO: POSSÍVEL GOLPE!

### Teste 2 - Baixo risco

Mensagem:

Olá, amanhã teremos uma reunião às 14 horas.

Resultado esperado:

Quantidade de sinais: 0

Mensagem classificada como: BAIXO RISCO.

### Teste 3 - Apenas um sinal

Mensagem:

O pagamento da mensalidade será realizado por PIX amanhã.

Resultado esperado:

Quantidade de sinais: 1

Mensagem classificada como: BAIXO RISCO.
