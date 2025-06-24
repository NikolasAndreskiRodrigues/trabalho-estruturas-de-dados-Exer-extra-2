# trabalho-estruturas-de-dados-Exer-extra-2

Grupo: Nikolas, Kaue, Gabriel e Mateus

1) Implemente o NoBinario e ArvoreBinaria, conforme apresentado nos slides das aulas presentes no disco virtual.

2) Crie um método que imprime a árvore: nível por nível; mostrando os elementos da raiz até os níveis inferiores.

Exemplo de saída:
Nível 0: 40  
Nível 1: 30 60  
Nível 2: 20 35 50 70 

3) Crie um método que verifica se a árvore binária de busca está desbalanceada.

4) Crie a classe Aluno que implemente Comparable. Deverá possuir os atributos String nome e int matricula. A partir disso:
- Crie uma ArvoreBinaria, ou seja, cada nó da árvore será um Aluno
- Insira pelo menos 5 alunos
- Implemente e utilize o percurso em ordem para imprimir os alunos ordenados por matrícula

Dica: talvez seja necessário implementar uma sobrescrita do método comparteTo em Aluno, para que seja comparado entre a matrícula, funcionando como uma chave. 