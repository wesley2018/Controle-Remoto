// BIBLIOTECAS IMPORTADAS PARA O CÓDIGO
#include <SPI.h>
#include <Client.h>
#include <Ethernet.h>
#include <Server.h>
#include <Udp.h>
#include <IRremote.h>
 
IRsend irsend; // VARIÁVEL RESPONSÁVEL PELO MÉTODO DE ENVIO DO SINAL IR
int tamanho = 68; // TAMANHO DA LINHA RAW(68 BLOCOS)
int frequencia = 32; // FREQUÊNCIA DO SINAL IR(32KHz)

// BOTÃO LIGA / DESLIGA
unsigned int LD[68] = {}; // COLE A LINHA RAW CORRESPONDENTE DENTRO DAS CHAVES
// BOTÃO EJECT
//unsigned int EJ[68] = {}; // UTILIZADO PARA APARELHOS DE SOM
// BOTÃO MUTE
unsigned int MT[68] = {}; // COLE A LINHA RAW CORRESPONDENTE DENTRO DAS CHAVES
// BOTÃO PLAY / PAUSE
unsigned int PP[68] = {}; // COLE A LINHA RAW CORRESPONDENTE DENTRO DAS CHAVES
// BOTÃO VOLTAR
unsigned int VT[68] = {}; // COLE A LINHA RAW CORRESPONDENTE DENTRO DAS CHAVES
// BOTÃO ADIANTAR
unsigned int AT[68] = {}; // COLE A LINHA RAW CORRESPONDENTE DENTRO DAS CHAVES
// BOTÃO UM
unsigned int UM[68] = {}; // COLE A LINHA RAW CORRESPONDENTE DENTRO DAS CHAVES
// BOTÃO DOIS
unsigned int DOIS[68] = {}; // COLE A LINHA RAW CORRESPONDENTE DENTRO DAS CHAVES
// BOTÃO TRES
unsigned int TRES[68] = {}; // COLE A LINHA RAW CORRESPONDENTE DENTRO DAS CHAVES
// BOTÃO QUATRO
unsigned int QUATRO[68] = {}; // COLE A LINHA RAW CORRESPONDENTE DENTRO DAS CHAVES
// BOTÃO CINCO
unsigned int CINCO[68] = {}; // COLE A LINHA RAW CORRESPONDENTE DENTRO DAS CHAVES
// BOTÃO SEIS
unsigned int SEIS[68] = {}; // COLE A LINHA RAW CORRESPONDENTE DENTRO DAS CHAVES
// BOTÃO SETE
unsigned int SETE[68] = {}; // COLE A LINHA RAW CORRESPONDENTE DENTRO DAS CHAVES
// BOTÃO OITO
unsigned int OITO[68] = {}; // COLE A LINHA RAW CORRESPONDENTE DENTRO DAS CHAVES
// BOTÃO NOVE
unsigned int NOVE[68] = {}; // COLE A LINHA RAW CORRESPONDENTE DENTRO DAS CHAVES
// BOTÃO AUMENTAR VOLUME
unsigned int VMAIS[68] = {}; // COLE A LINHA RAW CORRESPONDENTE DENTRO DAS CHAVES
// BOTÃO ZERO
unsigned int ZERO[68] = {}; // COLE A LINHA RAW CORRESPONDENTE DENTRO DAS CHAVES
// BOTÃO AVANÇAR CANAIS
unsigned int CMAIS[68] = {}; // COLE A LINHA RAW CORRESPONDENTE DENTRO DAS CHAVES
// BOTÃO ENTRADAS
unsigned int ENTRADAS[68] = {}; // COLE A LINHA RAW CORRESPONDENTE DENTRO DAS CHAVES
// BOTÃO DIMINUIR VOLUME
unsigned int VMENOS[68] = {}; // COLE A LINHA RAW CORRESPONDENTE DENTRO DAS CHAVES
// BOTÃO OK
unsigned int OK[68] = {}; // COLE A LINHA RAW CORRESPONDENTE DENTRO DAS CHAVES
// BOTÃO VOLTAR CANAIS
unsigned int CMENOS[68] = {}; // COLE A LINHA RAW CORRESPONDENTE DENTRO DAS CHAVES

byte mac[] = { 0xDE, 0xAD, 0xBE, 0xEF, 0xFE, 0xED }; // NÃO PRECISA MEXER
byte ip[] = { 192, 168, 0, 177 }; // COLOQUE UMA FAIXA DE IP DISPONÍVEL DO SEU ROTEADOR. EX: 192.168.1.110  **** ISSO VARIA, NO MEU CASO É: 192.168.0.177
byte gateway[] = { 192, 168, 0, 1 };// MUDE PARA O GATEWAY PADRÃO DO SEU ROTEADOR **** NO MEU CASO É O 192.168.0.1
byte subnet[] = { 255, 255, 255, 0 }; //NÃO PRECISA MEXER
EthernetServer server(80); //CASO OCORRA PROBLEMAS COM A PORTA 80, UTILIZE OUTRA (EX:8082,8089)
byte sampledata=50;            

String readString = String(30); //CRIA UMA STRING CHAMADA "readString"
 
void setup(){
  Ethernet.begin(mac, ip, gateway, subnet); // INICIALIZA A CONEXÃO ETHERNET
}
 
void loop() {
      
      EthernetClient client = server.available(); // CRIA UMA VARIÁVEL CHAMADA client
  if (client) { //SE EXISTE CLIENTE
    while (client.connected()) { // ENQUANTO  EXISTIR CLIENTE CONECTADO
   if (client.available()) { // SE EXISTIR CLIENTE HABILITADO
    char c = client.read(); // CRIA A VARIÁVEL c

    if (readString.length() < 100) // SE O ARRAY FOR MENOR QUE 100
      {
        readString += c; // "readstring" VAI RECEBER OS CARACTERES LIDO
      }
        if (c == '\n') { // SE ENCONTRAR "\n" É O FINAL DO CABEÇALHO DA REQUISIÇÃO HTTP
          if (readString.indexOf("?") <0) //SE ENCONTRAR O CARACTER "?"
          {
          }
          else // SENÃO
            if(readString.indexOf("B=LD") >0){ // SE ENCONTRAR O PARÂMETRO "L=BD"
              irsend.sendRaw(LD,tamanho,frequencia);  // PARÂMETROS NECESSÁRIOS PARA ENVIO DO SINAL IR
              delay(50); // TEMPO(EM MILISEGUNDOS) DE INTERVALO ENTRE UM COMANDO E OUTRO
            }
            /*if(readString.indexOf("B=EJ") >0){ // SE ENCONTRAR O PARÂMETRO "L=EJ"
              irsend.sendRaw(EJ,tamanho,frequencia);  // PARÂMETROS NECESSÁRIOS PARA ENVIO DO SINAL IR
              delay(50); // TEMPO(EM MILISEGUNDOS) DE INTERVALO ENTRE UM COMANDO E OUTRO
            }*/
            if(readString.indexOf("B=MT") >0){ // SE ENCONTRAR O PARÂMETRO "L=MT"
              irsend.sendRaw(MT,tamanho,frequencia); // PARÂMETROS NECESSÁRIOS PARA ENVIO DO SINAL IR
              delay(50); // TEMPO(EM MILISEGUNDOS) DE INTERVALO ENTRE UM COMANDO E OUTRO
            }
            if(readString.indexOf("B=PP") >0){ // SE ENCONTRAR O PARÂMETRO "L=PP"
              irsend.sendRaw(PP,tamanho,frequencia); // PARÂMETROS NECESSÁRIOS PARA ENVIO DO SINAL IR
              delay(50); // TEMPO(EM MILISEGUNDOS) DE INTERVALO ENTRE UM COMANDO E OUTRO
            }
            if(readString.indexOf("B=VT") >0){ // SE ENCONTRAR O PARÂMETRO "L=VT"
              irsend.sendRaw(VT,tamanho,frequencia); // PARÂMETROS NECESSÁRIOS PARA ENVIO DO SINAL IR
              delay(50); // TEMPO(EM MILISEGUNDOS) DE INTERVALO ENTRE UM COMANDO E OUTRO
            }
            if(readString.indexOf("B=AT") >0){ // SE ENCONTRAR O PARÂMETRO "L=AT"
              irsend.sendRaw(AT,tamanho,frequencia); // PARÂMETROS NECESSÁRIOS PARA ENVIO DO SINAL IR
              delay(50); // TEMPO(EM MILISEGUNDOS) DE INTERVALO ENTRE UM COMANDO E OUTRO
            }
            if(readString.indexOf("B=UM") >0){ // SE ENCONTRAR O PARÂMETRO "L=UM"
              irsend.sendRaw(UM,tamanho,frequencia); // PARÂMETROS NECESSÁRIOS PARA ENVIO DO SINAL IR
              delay(50); // TEMPO(EM MILISEGUNDOS) DE INTERVALO ENTRE UM COMANDO E OUTRO
            }
            if(readString.indexOf("B=DOIS") >0){ // SE ENCONTRAR O PARÂMETRO "L=DOIS"
              irsend.sendRaw(DOIS,tamanho,frequencia); // PARÂMETROS NECESSÁRIOS PARA ENVIO DO SINAL IR
              delay(50); // TEMPO(EM MILISEGUNDOS) DE INTERVALO ENTRE UM COMANDO E OUTRO
            }
            if(readString.indexOf("B=TRES") >0){ // SE ENCONTRAR O PARÂMETRO "L=TRES"
              irsend.sendRaw(TRES,tamanho,frequencia); // PARÂMETROS NECESSÁRIOS PARA ENVIO DO SINAL IR
              delay(50); // TEMPO(EM MILISEGUNDOS) DE INTERVALO ENTRE UM COMANDO E OUTRO
            }
            if(readString.indexOf("B=QUATRO") >0){ // SE ENCONTRAR O PARÂMETRO "L=QUATRO"
              irsend.sendRaw(QUATRO,tamanho,frequencia); // PARÂMETROS NECESSÁRIOS PARA ENVIO DO SINAL IR
              delay(50); // TEMPO(EM MILISEGUNDOS) DE INTERVALO ENTRE UM COMANDO E OUTRO
            }
            if(readString.indexOf("B=CINCO") >0){ // SE ENCONTRAR O PARÂMETRO "L=CINCO"
              irsend.sendRaw(CINCO,tamanho,frequencia); // PARÂMETROS NECESSÁRIOS PARA ENVIO DO SINAL IR
              delay(50); // TEMPO(EM MILISEGUNDOS) DE INTERVALO ENTRE UM COMANDO E OUTRO
            }
            if(readString.indexOf("B=SEIS") >0){ // SE ENCONTRAR O PARÂMETRO "L=SEIS"
              irsend.sendRaw(SEIS,tamanho,frequencia); // PARÂMETROS NECESSÁRIOS PARA ENVIO DO SINAL IR
              delay(50); // TEMPO(EM MILISEGUNDOS) DE INTERVALO ENTRE UM COMANDO E OUTRO
            }
            if(readString.indexOf("B=SETE") >0){ // SE ENCONTRAR O PARÂMETRO "L=SETE"
              irsend.sendRaw(SETE,tamanho,frequencia); // PARÂMETROS NECESSÁRIOS PARA ENVIO DO SINAL IR
              delay(50); // TEMPO(EM MILISEGUNDOS) DE INTERVALO ENTRE UM COMANDO E OUTRO
            }
            if(readString.indexOf("B=OITO") >0){ // SE ENCONTRAR O PARÂMETRO "L=OITO"
              irsend.sendRaw(OITO,tamanho,frequencia); // PARÂMETROS NECESSÁRIOS PARA ENVIO DO SINAL IR
              delay(50); // TEMPO(EM MILISEGUNDOS) DE INTERVALO ENTRE UM COMANDO E OUTRO
            }
            if(readString.indexOf("B=NOVE") >0){ // SE ENCONTRAR O PARÂMETRO "L=NOVE"
              irsend.sendRaw(NOVE,tamanho,frequencia); // PARÂMETROS NECESSÁRIOS PARA ENVIO DO SINAL IR
              delay(50); // TEMPO(EM MILISEGUNDOS) DE INTERVALO ENTRE UM COMANDO E OUTRO
            }
            if(readString.indexOf("B=VMAIS") >0){ // SE ENCONTRAR O PARÂMETRO "L=VMAIS"
              irsend.sendRaw(VMAIS,tamanho,frequencia); // PARÂMETROS NECESSÁRIOS PARA ENVIO DO SINAL IR
              delay(50); // TEMPO(EM MILISEGUNDOS) DE INTERVALO ENTRE UM COMANDO E OUTRO
            }
            if(readString.indexOf("B=ZERO") >0){ // SE ENCONTRAR O PARÂMETRO "L=ZERO"
              irsend.sendRaw(ZERO,tamanho,frequencia); // PARÂMETROS NECESSÁRIOS PARA ENVIO DO SINAL IR
              delay(50); // TEMPO(EM MILISEGUNDOS) DE INTERVALO ENTRE UM COMANDO E OUTRO
            }
            if(readString.indexOf("B=CMAIS") >0){ // SE ENCONTRAR O PARÂMETRO "L=CMAIS"
              irsend.sendRaw(CMAIS,tamanho,frequencia); // PARÂMETROS NECESSÁRIOS PARA ENVIO DO SINAL IR
              delay(50); // TEMPO(EM MILISEGUNDOS) DE INTERVALO ENTRE UM COMANDO E OUTRO
            }
            if(readString.indexOf("B=ENTRADAS") >0){ // SE ENCONTRAR O PARÂMETRO "L=ENTRADAS"
              irsend.sendRaw(ENTRADAS,tamanho,frequencia); // PARÂMETROS NECESSÁRIOS PARA ENVIO DO SINAL IR
              delay(50); // TEMPO(EM MILISEGUNDOS) DE INTERVALO ENTRE UM COMANDO E OUTRO
            }
            if(readString.indexOf("B=VMENOS") >0){ // SE ENCONTRAR O PARÂMETRO "L=VMENOS"
              irsend.sendRaw(VMENOS,tamanho,frequencia); // PARÂMETROS NECESSÁRIOS PARA ENVIO DO SINAL IR
              delay(50); // TEMPO(EM MILISEGUNDOS) DE INTERVALO ENTRE UM COMANDO E OUTRO
            }
            if(readString.indexOf("B=OK") >0){ // SE ENCONTRAR O PARÂMETRO "L=OK"
              irsend.sendRaw(OK,tamanho,frequencia); // PARÂMETROS NECESSÁRIOS PARA ENVIO DO SINAL IR
              delay(50); // TEMPO(EM MILISEGUNDOS) DE INTERVALO ENTRE UM COMANDO E OUTRO
            }
            if(readString.indexOf("B=CMENOS") >0){ // SE ENCONTRAR O PARÂMETRO "L=CMENOS"
              irsend.sendRaw(CMENOS,tamanho,frequencia); // PARÂMETROS NECESSÁRIOS PARA ENVIO DO SINAL IR
              delay(50); // TEMPO(EM MILISEGUNDOS) DE INTERVALO ENTRE UM COMANDO E OUTRO
            }
              client.println("HTTP/1.1 200 OK"); // ESCREVE PARA O CLIENTE A VERSÃO DO HTTP
              client.println("Content-Type: text/html"); // ESCREVE PARA O CLIENTE O TIPO DE CONTEÚDO(texto/html)
              client.println();
              readString="";
              client.stop(); // FINALIZA A REQUISIÇÃO HTTP
            }
          }
        }
      }
}
