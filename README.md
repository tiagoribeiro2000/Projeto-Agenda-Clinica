# Sistema Agenda Clínica
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/tiagoribeiro2000/Projeto-Agenda-Clinica/blob/main/LICENSE) 

# Sobre o projeto
O Sistema Agenda Clínica, é um projeto pessoal para mostrar minhas habilidades em linguagem java.

O Sistema possui uma tela de login onde o usuário deve ser cadastrado para conseguir logar e entrar no sistema. Possui controle de acesso onde somente o administrador consegue fazer modificações como:
*Cadastrar usuários, médicos, pacientes, enfermeiros
*Excluir usuários, médicos, pacientes, enfermeiros
*Marcar e desmarcar consultas.
*Cadastrar endereços, modificar e excluir .

## Layout do projeto

## Tela Login
![Tela Login](https://github.com/tiagoribeiro2000/Projeto-Agenda-Clinica/blob/main/ImagensDoProjeto/telaLogin.png) 

## Tela Principal
![Tela Principal](https://github.com/tiagoribeiro2000/Projeto-Agenda-Clinica/blob/main/ImagensDoProjeto/TelaPrincipal.png)

## Tela Usuários
![Tela Usuários](https://github.com/tiagoribeiro2000/Projeto-Agenda-Clinica/blob/main/ImagensDoProjeto/TelaCadastroUsuarios.png)

## Tela Médicos
![Tela Médicos](https://github.com/tiagoribeiro2000/Projeto-Agenda-Clinica/blob/main/ImagensDoProjeto/TelaMedicos.png)

# Tecnologias utilizadas
- Java
- Apache NetBeans IDE 12.2
## Implantação em produção
- Banco de dados: Postgresql

# Como executar o projeto
1-Clone ou baixe o arquivo zip do projeto.
2-Crie um banco de dados com nome projetoclinica.
3-Clique com botão direito do mouse em cima do banco de dados que você criou e selecione a opção restore, selecione o banco de dados que você baixou com o arquivo do projeto e clique em restore. 
4-Abra o apache netbeans 12. Em arquivo ou file, Selecione abrir projeto e escolha o arquivo que está no local que você baixou o projeto e clique em abrir projeto.
5- Procure o pacote modeloConection, abra a classe ConexaoBD.Java e modifique a senha. 
6-public class ConexaoBD {
    
    public Statement stm;
    public ResultSet rs;
    private String driver = "org.postgresql.Driver";
    private String url="jdbc:postgresql://localhost:5432/projetoclinica";
    private String usuario="postgres";
    private String senha="1234";//Aqui você deve inserir a senha que você usa para entrar no pgAdmin.
    public Connection con;
    }
    
    7- Se você fez todos os passos corretamente, agora selecione TelaLogin.java aperte shift + f6.   


# Autor

Tiago Ribeiro

https://www.linkedin.com/in/tiago-ribeiro-326274a2/


