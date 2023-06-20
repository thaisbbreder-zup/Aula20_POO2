# Aula20_POO2


## 🎓 Sistema de Funcionários 🎓   

Neste projeto, modelamos as classes relacionadas aos funcionários de uma universidade, incluindo professores, coordenadores, funcionários administrativos e estagiários.

### Atributos ✏️
Todos os funcionários possuem os seguintes atributos em comum:

- Nome
- CPF
- Número de registro
- Órgão de lotação
- Salário
<br>
Professores possuem os seguintes atributos adicionais:

- Nível de graduação
- Disciplina ministrada
- Quantidade de alunos
- Quantidade de turmas
<br>
Coordenadores possuem os seguintes atributos adicionais:

- Professores supervisionados
<br>
Funcionários administrativos possuem os seguintes atributos adicionais:

- Função administrativa
- Senioridade

### Métodos 📚
Além dos getters, setters e construtores, foram implementados os seguintes métodos:

- aumentoSalario(): Aumenta o salário em 10% para todos os funcionários, exceto coordenadores (aumento de 5% para coordenadores).
- adicionaTurma(): Adiciona uma nova turma para os professores.
- adicionaProfessor(): Adiciona um novo professor à lista de professores supervisionados para os coordenadores.

### Desafio Extra 🚀
Adicionar a classe Turma, como uma característica dos professores por meio de composição.
Limitar a quantidade de professores supervisionados na classe Coordenador.

### Resultado 

#### Coordenador
<img width="398" alt="Captura de tela 2023-06-19 215020" src="https://github.com/thaisbbreder-zup/Aula20_POO2/assets/133882082/77db8646-566c-433d-bbd1-4d0b27db8063"><br>
 <img width="424" alt="Captura de tela 2023-06-19 215031" src="https://github.com/thaisbbreder-zup/Aula20_POO2/assets/133882082/59139d9b-1ef5-4fdb-bfe7-72200077a152">


#### Professor<br>
<img width="494" alt="Captura de tela 2023-06-19 215231" src="https://github.com/thaisbbreder-zup/Aula20_POO2/assets/133882082/fd72f4bd-5d7f-480d-98a5-8f75f81024a2"><br>
<img width="493" alt="Captura de tela 2023-06-19 215239" src="https://github.com/thaisbbreder-zup/Aula20_POO2/assets/133882082/e81c2224-796a-4551-92bb-f6931eaca930"><br>
