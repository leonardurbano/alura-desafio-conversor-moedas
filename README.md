<div align="center" margin="10"><img src="https://img.freepik.com/premium-vector/java-vector-icon-design-illustration_1174953-24747.jpg" width="200"></div>

## DESAFIO ALURA: Conversor de Moedas
Desafio do Curso de Praticando Java: Challenge conversor de moedas

## Objetivo:
Programa em Java que acesse a Exchangerate-API e consome dados para conversão de 6 moedas estrangeiras e converter para a moeda real brasil, foi desenvolvido para acesso pelo prompt, tela de texto.

[Link da API](https://www.exchangerate-api.com/)
![image](https://github.com/user-attachments/assets/690e71a4-2444-4064-9ead-5158f1c1d62f) 

## Estutura de arquivos

... src\
.....^ application\
............^ Program.java\
.....^ entities\
............^ Currency.java\
............^ CurrencyId.java\
.....^ utilities\
............^ CurrencyCalc.java\
............^ ExchangerateHttp.java\
............^ ExchangerateKey.java

## Telas
<div align="center">
<p><img src="https://github-production-user-asset-6210df.s3.amazonaws.com/62488293/380535573-082b2796-1978-4a29-b669-b323436c1e05.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20241027%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20241027T224458Z&X-Amz-Expires=300&X-Amz-Signature=bc128ef23a5aded11f06213ce503439126ea7118ba471fa534a059fd3c6fcd61&X-Amz-SignedHeaders=host" width="350"></p>
<p><img src="https://github-production-user-asset-6210df.s3.amazonaws.com/62488293/380535631-db6b8232-0b9d-4d2c-aae6-5a9925be0e59.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20241027%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20241027T224537Z&X-Amz-Expires=300&X-Amz-Signature=fb1b4ed5b54bd7af2f9316573db5d07306208e1e7a9c1044d20c0f8d3fb6ae32&X-Amz-SignedHeaders=host" width="350"></p>
</div>

## Um pouco mais sobre o desafio
Ao consumir API evita que a conversão seja estática e aplicação seja mais proprícia a manutenção;\
Foram utilizados fortemente os seguintes recursos na aplicação java:
* Class HttpClient
* Class HttpRequest
* Interface HttpResponse<T>
* Class Scanner

## Agradecimento
Agradeço pela oportunidade promovido pelo projeto [ONE - Oracle Next Education](https://www.oracle.com/br/education/oracle-next-education/) uma parceria da Oracle com a [Alura Latam](https://www.alura.com.br/).
