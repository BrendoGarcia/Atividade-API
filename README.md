# Atividade-API
Atividade API em JAVA. 


Para Execultar Basta clonar o repositorio e execultar o codigo na ide ECLIPSE e fundamental que seja nessa IDE. casso queira fazer o deploy basta escolher o serviço e fazer as alterações do banco.

Metodos Cadastrados No Controller da API.
https://atividade-api-production.up.railway.app/professor = Metodo GET. Recebi todos os professores cadastrados no banco de dados;

```bash
[
  {
    "nomeprofessor": "Brendo Garcia",
    "senhaacesso": "123",
    "datanascimento": "11/07/1999",
    "status": "ATIVO"
  }
]
```

https://atividade-api-production.up.railway.app/registrar = Metodo Post. Cria um professor o post deve ser enviado em formato Json. contendo os seguintes dados:

```bash
{
    "nomeprofessor": "Brendo Garcia",
    "senhaacesso": "123",
    "datanascimento": "11/07/1999",
    "status": "ATIVO"
  }
```
