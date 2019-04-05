package com.example.controle_remoto;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Controle_Remoto_Activity extends ActionBarActivity implements OnClickListener {

	ImageButton btConectar, btLiga,btEject,btMute,btPlayPause,btVoltar,btAdianta,btUm, 
	btDois,btTres,btQuatro,btCinco,btSeis,btSete,btOito,btNove, 
	btZero,btVcima,btVbaixo,btCcima,btCabaixo,btEntrada, btOk;
	EditText et_Ip;
	TextView tvHexadecimal;
	String hostIp = null;
	long lastPress;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		telaIp(); // FAZ A CHAMADA DO MÉTODO "telaIp"
	}
	// MÉTODO "telaIp"
		public void telaIp(){
			setContentView(R.layout.tela_ip); // INICIALIZA A TELA
			et_Ip = (EditText)findViewById(R.id.et_Ip); // ESTANCIA O EDITTEXT
			
	    	btConectar = (ImageButton) findViewById(R.id.btConectar); // ESTANCIA O IMAGEBUTTON
	        btConectar.setOnClickListener(this); // ATIVA O CLICK DO BOTÃO
	    	
	    	if(btConectar.isPressed()){ // SE O BOTÃO FOR PRESSIONADO
	    		onClick(btConectar); // EXECUTA A FUNÇÃO REFERENTE AO BOTÃO
	    	}
	    }
		// MÉTODO "telaPrincipal"
		public void telaPrincipal(){   	
			setContentView(R.layout.activity_controle_remoto_); // INICIALIZA A TELA

	        btLiga = (ImageButton) findViewById(R.id.btLiga);
			btEject = (ImageButton) findViewById(R.id.btEject);
			btMute = (ImageButton) findViewById(R.id.btMute);
			btPlayPause = (ImageButton) findViewById(R.id.btPlayPause);
			btVoltar = (ImageButton) findViewById(R.id.btVolta);
			btAdianta = (ImageButton) findViewById(R.id.btAdianta);
			btUm = (ImageButton) findViewById(R.id.btUm);
			btDois = (ImageButton) findViewById(R.id.btDois);
			btTres = (ImageButton) findViewById(R.id.btTres);
			btQuatro = (ImageButton) findViewById(R.id.btQuatro);
			btCinco = (ImageButton) findViewById(R.id.btCinco);
			btSeis = (ImageButton) findViewById(R.id.btSeis);
			btSete = (ImageButton) findViewById(R.id.btSete);
			btOito = (ImageButton) findViewById(R.id.btOito);
			btNove = (ImageButton) findViewById(R.id.btNove);
			btZero = (ImageButton) findViewById(R.id.btZero);
			btVcima = (ImageButton) findViewById(R.id.btVcima);
			btVbaixo = (ImageButton) findViewById(R.id.btVbaixo);
			btCcima = (ImageButton) findViewById(R.id.btCcima);
			btCabaixo = (ImageButton) findViewById(R.id.btCabaixo);
			btEntrada = (ImageButton) findViewById(R.id.btEntrada);
			btOk = (ImageButton) findViewById(R.id.btOk);

			btLiga.setOnClickListener(this);
			btEject.setOnClickListener(this);
			btMute.setOnClickListener(this);
			btPlayPause.setOnClickListener(this);
			btVoltar.setOnClickListener(this);
			btAdianta.setOnClickListener(this);
			btUm.setOnClickListener(this);
			btDois.setOnClickListener(this);
			btTres.setOnClickListener(this);
			btQuatro.setOnClickListener(this);
			btCinco.setOnClickListener(this);
			btSeis.setOnClickListener(this);
			btSete.setOnClickListener(this);
			btOito.setOnClickListener(this);
			btNove.setOnClickListener(this);
			btZero.setOnClickListener(this);
			btVcima.setOnClickListener(this);
			btVbaixo.setOnClickListener(this);
			btCcima.setOnClickListener(this);
			btCabaixo.setOnClickListener(this);
			btEntrada.setOnClickListener(this);
			btOk.setOnClickListener(this);
		
			if(btLiga.isPressed()){ // SE O BOTÃO FOR PRESSIONADO
				onClick(btLiga); // EXECUTA A FUNÇÃO REFERENTE AO BOTÃO
			}
			if(btEject.isPressed()){ // SE O BOTÃO FOR PRESSIONADO
				onClick(btEject); // EXECUTA A FUNÇÃO REFERENTE AO BOTÃO
			}
			if(btMute.isPressed()){ // SE O BOTÃO FOR PRESSIONADO
				onClick(btMute); // EXECUTA A FUNÇÃO REFERENTE AO BOTÃO
			}
			if(btPlayPause.isPressed()){ // SE O BOTÃO FOR PRESSIONADO
				onClick(btPlayPause); // EXECUTA A FUNÇÃO REFERENTE AO BOTÃO
			}
			if(btVoltar.isPressed()){ // SE O BOTÃO FOR PRESSIONADO
				onClick(btVoltar); // EXECUTA A FUNÇÃO REFERENTE AO BOTÃO
			}
			if(btAdianta.isPressed()){ // SE O BOTÃO FOR PRESSIONADO
				onClick(btAdianta); // EXECUTA A FUNÇÃO REFERENTE AO BOTÃO
			}
			if(btUm.isPressed()){ // SE O BOTÃO FOR PRESSIONADO
				onClick(btUm); // EXECUTA A FUNÇÃO REFERENTE AO BOTÃO
			}
			if(btDois.isPressed()){ // SE O BOTÃO FOR PRESSIONADO
				onClick(btDois); // EXECUTA A FUNÇÃO REFERENTE AO BOTÃO
			}
			if(btTres.isPressed()){ // SE O BOTÃO FOR PRESSIONADO
				onClick(btTres); // EXECUTA A FUNÇÃO REFERENTE AO BOTÃO
			}
			if(btQuatro.isPressed()){ // SE O BOTÃO FOR PRESSIONADO
				onClick(btQuatro); // EXECUTA A FUNÇÃO REFERENTE AO BOTÃO
			}
			if(btCinco.isPressed()){ // SE O BOTÃO FOR PRESSIONADO
				onClick(btCinco); // EXECUTA A FUNÇÃO REFERENTE AO BOTÃO
			}
			if(btSeis.isPressed()){ // SE O BOTÃO FOR PRESSIONADO
				onClick(btSeis); // EXECUTA A FUNÇÃO REFERENTE AO BOTÃO
			}
			if(btSete.isPressed()){ // SE O BOTÃO FOR PRESSIONADO
				onClick(btSete); // EXECUTA A FUNÇÃO REFERENTE AO BOTÃO
			}
			if(btOito.isPressed()){ // SE O BOTÃO FOR PRESSIONADO
				onClick(btOito); // EXECUTA A FUNÇÃO REFERENTE AO BOTÃO
			}
			if(btNove.isPressed()){ // SE O BOTÃO FOR PRESSIONADO
				onClick(btNove); // EXECUTA A FUNÇÃO REFERENTE AO BOTÃO
			}
			if(btZero.isPressed()){ // SE O BOTÃO FOR PRESSIONADO
				onClick(btZero); // EXECUTA A FUNÇÃO REFERENTE AO BOTÃO
			}
			if(btVcima.isPressed()){ // SE O BOTÃO FOR PRESSIONADO
				onClick(btVcima); // EXECUTA A FUNÇÃO REFERENTE AO BOTÃO
			}
			if(btVbaixo.isPressed()){ // SE O BOTÃO FOR PRESSIONADO
				onClick(btVbaixo); // EXECUTA A FUNÇÃO REFERENTE AO BOTÃO
			}
			if(btCcima.isPressed()){ // SE O BOTÃO FOR PRESSIONADO
				onClick(btCcima); // EXECUTA A FUNÇÃO REFERENTE AO BOTÃO
			}
			if(btCabaixo.isPressed()){ // SE O BOTÃO FOR PRESSIONADO
				onClick(btCabaixo); // EXECUTA A FUNÇÃO REFERENTE AO BOTÃO
			}
			if(btEntrada.isPressed()){ // SE O BOTÃO FOR PRESSIONADO
				onClick(btEntrada); // EXECUTA A FUNÇÃO REFERENTE AO BOTÃO
			}
			if(btOk.isPressed()){ // SE O BOTÃO FOR PRESSIONADO
				onClick(btOk); // EXECUTA A FUNÇÃO REFERENTE AO BOTÃO
			}
		}
		@Override
		public void onClick(View bt) { // MÉTODO QUE GERENCIA OS CLICK'S NOS BOTÕES
			
			if(bt == btConectar){ // SE BOTÃO CLICKADO
				if(et_Ip.getText().toString().equals("")){ // SE EDITTEXT ESTIVER VAZIO
					Toast.makeText(getApplicationContext(), // FUNÇÃO TOAST
					"Digite o IP do Ethernet Shield!", Toast.LENGTH_SHORT).show(); // EXIBE A MENSAGEM
				}else{ // SENÃO
				hostIp = et_Ip.getText().toString(); // STRING "hostIp" RECEBE OS DADOS DO EDITTEXT CONVERTIDOS EM STRING
				// FUNÇÃO QUE OCULTA O TECLADO APÓS CLICAR EM CONECTAR
				InputMethodManager escondeTeclado = (InputMethodManager)getSystemService(
			    Context.INPUT_METHOD_SERVICE);
			    escondeTeclado.hideSoftInputFromWindow(et_Ip.getWindowToken(), 0);
				telaPrincipal(); // FAZ A CHAMADA DO MÉTODO "telaPrincipal"
				}	
			}
			String url = null; // CRIA UMA STRING CHAMADA "url" QUE POSSUI VALOR NULO
					
			if(bt == btLiga){ // BOTÃO LIGA / DESLIGA
				url = "http://"+hostIp+"/?B=LD";	
			}
			if(bt == btEject){ // BOTÃO EJECT
				url = "http://"+hostIp+"/?B=EJ";		
			}
			if(bt == btMute){ // BOTÃO MUTE
				url = "http://"+hostIp+"/?B=MT";		
			}
			if(bt == btPlayPause){  // BOTÃO PLAY / PAUSE
				url = "http://"+hostIp+"/?B=PP";	
			}
			if(bt == btVoltar){ // BOTÃO VOLTAR 
				url = "http://"+hostIp+"/?B=VT";			
			}
			if(bt == btAdianta){  // BOTÃO ADIANTAR
				url = "http://"+hostIp+"/?B=AT";		
			}
			if(bt == btUm){
				url = "http://"+hostIp+"/?B=UM";			
			}
			if(bt == btDois){
				url = "http://"+hostIp+"/?B=DOIS";			
			}
			if(bt == btTres){
				url = "http://"+hostIp+"/?B=TRES";		
			}
			if(bt == btQuatro){
				url = "http://"+hostIp+"/?B=QUATRO";		
			}
			if(bt == btCinco){
				url = "http://"+hostIp+"/?B=CINCO";		
			}
			if(bt == btSeis){
				url = "http://"+hostIp+"/?B=SEIS";		
			}
			if(bt == btSete){
				url = "http://"+hostIp+"/?B=SETE";		
			}
			if(bt == btOito){
				url = "http://"+hostIp+"/?B=OITO";			
			}
			if(bt == btNove){
				url = "http://"+hostIp+"/?B=NOVE";		
			}
			if(bt == btZero){
				url = "http://"+hostIp+"/?B=ZERO";		
			}
			if(bt == btVcima){ // BOTÃO AUMENTAR VOLUME
				url = "http://"+hostIp+"/?B=VMAIS";		
			}
			if(bt == btVbaixo){  // BOTÃO DIMINUIR VOLUME
				url = "http://"+hostIp+"/?B=VMENOS";		
			}
			if(bt == btEntrada){ // BOTÃO ENTRADAS
				url = "http://"+hostIp+"/?B=ENTRADAS";		
			}
			if(bt == btCcima){  // BOTÃO AVANÇAR CANAIS
				url = "http://"+hostIp+"/?B=CMAIS";		
			}
			if(bt == btCabaixo){  // BOTÃO VOLTAR CANAIS
				url = "http://"+hostIp+"/?B=CMENOS";		
			}
			if(bt == btOk){ // BOTÃO OK
				url = "http://"+hostIp+"/?B=OK";			
			}
			
			String urlGetHost = url; // CRIA UMA STRING CHAMADA "urlGetHost" QUE RECEBE O VALOR DA STRING "url"
			
			//INICIO DO TRY CATCH
			try{
				ConectHttpClient.executaHttpGet(urlGetHost); // PASSA O PARÂMETRO PARA O O MÉTODO "executaHttpGet" NA CLASSE "ConectHttpClient" E ENVIA AO ARDUINO
			}
			catch(Exception erro){ // FUNÇÃO DE EXIBIÇÃO DO ERRO
			} // FIM DO TRY CATCH	
		}
		// MÉTODO QUE VERIFICA O BOTÃO DE VOLTAR DO DISPOSITIVO ANDROID E ENCERRA A APLICAÇÃO SE PRESSIONADO 2 VEZES SEGUIDAS
	    public void onBackPressed() {		
		    long currentTime = System.currentTimeMillis();
		    if(currentTime - lastPress > 5000){
		        Toast.makeText(getBaseContext(), "Pressione novamente para sair.", Toast.LENGTH_LONG).show();
		        lastPress = currentTime;  
		    }else{
		        super.onBackPressed();
		        android.os.Process.killProcess(android.os.Process.myPid());
		    }
		}
}