# AGENCIA DE VIAGENS SANCHES

## PREMISSAS

- UMA AGENCIA DE VIAGENS MUITA FAMOSA SITUADA EM TAUBATÉ, INTERIOR DE SÃO PAULO, DECIDIU DISPONIBILIZAR NO SEU SITE UMA FERRAMENTA ONDE INFORMADO O NOME DE UM ESTADO DO BRASIL É DEVOLVIDO O NUMERO TOTAL DE SUA POPULAÇÃO E SUA CIDADE MAIS FAMOSA.

## SUA MISSÃO
- CRIAR UM PROJETO USANDO [SPRINGBOOT](https://start.spring.io/)
- EXPORT O ENDPOINT: **/API/V1/ESTADO-DETALHES** via GET
- TODA VEZ QUE HOUVER UM GET NESSE ENDPOINT:
  - SE FOR UM ESTADO QUE NÃO EXISTA DEVERÁ VOLTAR A MSG: *"ESTADO NÃO ENCONTRADO"*
  - SE O NOME DO ESTADO VIER EM BRANCO DEVERÁ VOLTAR A MSG: *"O NOME DO ESTADO É OBRIGATÓRIO"*
  - SE FOR UM ESTADO QUE EXISTA DEVERÁ VOLTAR A MSG: 
  
	    {
			ESTADO: NOME_ESTADO,
			POPULACAO: NUMERO_POPULAÇÃO,
			CIDADE_MAIS_FAMOSA: NOME_CIDADE
		}
- DEVE SER USADO ENUM PARA CONTER AS INFORMAÇÕES DOS ESTADOS

## ENUM

|ESTADO_DETALHES||
|--|--|
|-ESTADO|STRING|
|-POPULAÇÃO|STRING|
|-CIDADE_MAIS_FAMOSA|STRING|
|**MÉTODOS**||
|+RESPONSE_OF(STRING ESTADO)|ESTADO_DETALHES_RESPONSE|

    ("São Paulo", "46 289 333", "São Paulo"),  
	("Minas Gerais", "21 292 666", "Ouro Preto"),  
	("Rio de Janeiro", "17 366 189", "Rio Janeiro"),  
	("Bahia Bahia", "14 930 634", "Salvador"),  
	("Paraná", "11 516 840", "Curitiba"),  
	("Rio Grande do Sul", "11 422 973", "Porto Alegre"),  
	("Pernambuco", "9 616 621", "Recife"),  
	("Ceará", "9 187 103", "Aracati"),  
	("Pará", "8 690 745", "Belém"),  
	("Santa Catarina", "7 252 502", "Florianópolis"),  
	("Maranhão", "7 114 598", "São Luís"),  
	("Goiás", "7 113 540", "Caldas Novas"),  
	("Amazonas", "4 207 714", "Manaus"),  
	("Espírito Santo", "4 064 052", "Vila Velha"),  
	("Paraíba", "4 039 277", "Campina Grande"),  
	("Rio Grande do Norte", "3 534 165", "Maracajaú"),  
	("Mato Grosso", "3 526 220", "Cuiabá"),  
	("Alagoas", "3 351 543", "Maragogi"),  
	("Piauí", "3 281 480", "Teresina"),  
	("Distrito Federal", "3 055 149", "Brasília"),  
	("Mato Grosso do Sul", "2 809 394", "Corumbá"),  
	("Sergipe", "2 318 822", "Aracajú"),  
	("Rondônia", "1 796 460", "Porto Velho"),  
	("Tocantins", "1 590 248", "Palmas"),  
	("Acre", "894 470", "Rio Branco"),  
	("Amapá", "861 773", "Oiapoque"),  
	("Roraima", "631 181", "Alto alegre");

## CLASSES

|PESQUISA_CONTROLLER||
|--|--|
|**MÉTODOS**||
|+ESTADOS_DETALHES(STRING ESTADO)|RESPONSE_ENTITY\<ESTADO_DETALHES_RESPONSE\>|
--
|ESTADO_DETALHES_RESPONSE||
|--|--|
|-ERRO|FINAL STRING|
|-ESTADO|STRING|
|-POPULACAO|STRING|
|-CIDADE_MAIS_FAMOSA|STRING|
|**CONSTRUTOR**||
|+ESTADO_DETALHES_RESPONSE(STRING ERRO)||

## DEPENDÊNCIAS DO MAVEN

	<dependencies>  
		<dependency> 
			<groupId>org.springframework.boot</groupId>  
			<artifactId>spring-boot-starter-web</artifactId>  
		</dependency>
		  
		<dependency> 
			<groupId>org.springframework.boot</groupId>  
			<artifactId>spring-boot-starter-tomcat</artifactId>  
			<scope>compile</scope>  
		</dependency>
		 
		<dependency> 
			<groupId>org.springframework.boot</groupId>  
			<artifactId>spring-boot-starter-test</artifactId>  
			<scope>test</scope>  
		</dependency>
		 
		<dependency> 
			<groupId>org.projectlombok</groupId>  
			<artifactId>lombok</artifactId>  
			<version>1.18.18</version>  
			<scope>provided</scope>  
		</dependency>
	</dependencies>

