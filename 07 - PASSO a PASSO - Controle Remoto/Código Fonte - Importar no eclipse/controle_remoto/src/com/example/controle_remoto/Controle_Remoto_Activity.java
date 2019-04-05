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
		telaIp(); // FAZ A CHAMADA DO M�TODO "telaIp"
	}
	// M�TODO "telaIp"
		public void telaIp(){
			setContentView(R.layout.tela_ip); // INICIALIZA A TELA
			et_Ip = (EditText)findViewById(R.id.et_Ip); // ESTANCIA O EDITTEXT
			
	    	btConectar = (ImageButton) findViewById(R.id.btConectar); // ESTANCIA O IMAGEBUTTON
	        btConectar.setOnClickListener(this); // ATIVA O CLICK DO BOT�O
	    	
	    	if(btConectar.isPressed()){ // SE O BOT�O FOR PRESSIONADO
	    		onClick(btConectar); // EXECUTA A FUN��O REFERENTE AO BOT�O
	    	}
	    }
		// M�TODO "telaPrincipal"
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
		
			if(btLiga.isPressed()){ // SE O BOT�O FOR PRESSIONADO
				onClick(btLiga); // EXECUTA A FUN��O REFERENTE AO BOT�O
			}
			if(btEject.isPressed()){ // SE O BOT�O FOR PRESSIONADO
				onClick(btEject); // EXECUTA A FUN��O REFERENTE AO BOT�O
			}
			if(btMute.isPressed()){ // SE O BOT�O FOR PRESSIONADO
				onClick(btMute); // EXECUTA A FUN��O REFERENTE AO BOT�O
			}
			if(btPlayPause.isPressed()){ // SE O BOT�O FOR PRESSIONADO
				onClick(btPlayPause); // EXECUTA A FUN��O REFERENTE AO BOT�O
			}
			if(btVoltar.isPressed()){ // SE O BOT�O FOR PRESSIONADO
				onClick(btVoltar); // EXECUTA A FUN��O REFERENTE AO BOT�O
			}
			if(btAdianta.isPressed()){ // SE O BOT�O FOR PRESSIONADO
				onClick(btAdianta); // EXECUTA A FUN��O REFERENTE AO BOT�O
			}
			if(btUm.isPressed()){ // SE O BOT�O FOR PRESSIONADO
				onClick(btUm); // EXECUTA A FUN��O REFERENTE AO BOT�O
			}
			if(btDois.isPressed()){ // SE O BOT�O FOR PRESSIONADO
				onClick(btDois); // EXECUTA A FUN��O REFERENTE AO BOT�O
			}
			if(btTres.isPressed()){ // SE O BOT�O FOR PRESSIONADO
				onClick(btTres); // EXECUTA A FUN��O REFERENTE AO BOT�O
			}
			if(btQuatro.isPressed()){ // SE O BOT�O FOR PRESSIONADO
				onClick(btQuatro); // EXECUTA A FUN��O REFERENTE AO BOT�O
			}
			if(btCinco.isPressed()){ // SE O BOT�O FOR PRESSIONADO
				onClick(btCinco); // EXECUTA A FUN��O REFERENTE AO BOT�O
			}
			if(btSeis.isPressed()){ // SE O BOT�O FOR PRESSIONADO
				onClick(btSeis); // EXECUTA A FUN��O REFERENTE AO BOT�O
			}
			if(btSete.isPressed()){ // SE O BOT�O FOR PRESSIONADO
				onClick(btSete); // EXECUTA A FUN��O REFERENTE AO BOT�O
			}
			if(btOito.isPressed()){ // SE O BOT�O FOR PRESSIONADO
				onClick(btOito); // EXECUTA A FUN��O REFERENTE AO BOT�O
			}
			if(btNove.isPressed()){ // SE O BOT�O FOR PRESSIONADO
				onClick(btNove); // EXECUTA A FUN��O REFERENTE AO BOT�O
			}
			if(btZero.isPressed()){ // SE O BOT�O FOR PRESSIONADO
				onClick(btZero); // EXECUTA A FUN��O REFERENTE AO BOT�O
			}
			if(btVcima.isPressed()){ // SE O BOT�O FOR PRESSIONADO
				onClick(btVcima); // EXECUTA A FUN��O REFERENTE AO BOT�O
			}
			if(btVbaixo.isPressed()){ // SE O BOT�O FOR PRESSIONADO
				onClick(btVbaixo); // EXECUTA A FUN��O REFERENTE AO BOT�O
			}
			if(btCcima.isPressed()){ // SE O BOT�O FOR PRESSIONADO
				onClick(btCcima); // EXECUTA A FUN��O REFERENTE AO BOT�O
			}
			if(btCabaixo.isPressed()){ // SE O BOT�O FOR PRESSIONADO
				onClick(btCabaixo); // EXECUTA A FUN��O REFERENTE AO BOT�O
			}
			if(btEntrada.isPressed()){ // SE O BOT�O FOR PRESSIONADO
				onClick(btEntrada); // EXECUTA A FUN��O REFERENTE AO BOT�O
			}
			if(btOk.isPressed()){ // SE O BOT�O FOR PRESSIONADO
				onClick(btOk); // EXECUTA A FUN��O REFERENTE AO BOT�O
			}
		}
		@Override
		public void onClick(View bt) { // M�TODO QUE GERENCIA OS CLICK'S NOS BOT�ES
			
			if(bt == btConectar){ // SE BOT�O CLICKADO
				if(et_Ip.getText().toString().equals("")){ // SE EDITTEXT ESTIVER VAZIO
					Toast.makeText(getApplicationContext(), // FUN��O TOAST
					"Digite o IP do Ethernet Shield!", Toast.LENGTH_SHORT).show(); // EXIBE A MENSAGEM
				}else{ // SEN�O
				hostIp = et_Ip.getText().toString(); // STRING "hostIp" RECEBE OS DADOS DO EDITTEXT CONVERTIDOS EM STRING
				// FUN��O QUE OCULTA O TECLADO AP�S CLICAR EM CONECTAR
				InputMethodManager escondeTeclado = (InputMethodManager)getSystemService(
			    Context.INPUT_METHOD_SERVICE);
			    escondeTeclado.hideSoftInputFromWindow(et_Ip.getWindowToken(), 0);
				telaPrincipal(); // FAZ A CHAMADA DO M�TODO "telaPrincipal"
				}	
			}
			String url = null; // CRIA UMA STRING CHAMADA "url" QUE POSSUI VALOR NULO
					
			if(bt == btLiga){ // BOT�O LIGA / DESLIGA
				url = "http://"+hostIp+"/?B=LD";	
			}
			if(bt == btEject){ // BOT�O EJECT
				url = "http://"+hostIp+"/?B=EJ";		
			}
			if(bt == btMute){ // BOT�O MUTE
				url = "http://"+hostIp+"/?B=MT";		
			}
			if(bt == btPlayPause){  // BOT�O PLAY / PAUSE
				url = "http://"+hostIp+"/?B=PP";	
			}
			if(bt == btVoltar){ // BOT�O VOLTAR 
				url = "http://"+hostIp+"/?B=VT";			
			}
			if(bt == btAdianta){  // BOT�O ADIANTAR
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
			if(bt == btVcima){ // BOT�O AUMENTAR VOLUME
				url = "http://"+hostIp+"/?B=VMAIS";		
			}
			if(bt == btVbaixo){  // BOT�O DIMINUIR VOLUME
				url = "http://"+hostIp+"/?B=VMENOS";		
			}
			if(bt == btEntrada){ // BOT�O ENTRADAS
				url = "http://"+hostIp+"/?B=ENTRADAS";		
			}
			if(bt == btCcima){  // BOT�O AVAN�AR CANAIS
				url = "http://"+hostIp+"/?B=CMAIS";		
			}
			if(bt == btCabaixo){  // BOT�O VOLTAR CANAIS
				url = "http://"+hostIp+"/?B=CMENOS";		
			}
			if(bt == btOk){ // BOT�O OK
				url = "http://"+hostIp+"/?B=OK";			
			}
			
			String urlGetHost = url; // CRIA UMA STRING CHAMADA "urlGetHost" QUE RECEBE O VALOR DA STRING "url"
			
			//INICIO DO TRY CATCH
			try{
				ConectHttpClient.executaHttpGet(urlGetHost); // PASSA O PAR�METRO PARA O O M�TODO "executaHttpGet" NA CLASSE "ConectHttpClient" E ENVIA AO ARDUINO
			}
			catch(Exception erro){ // FUN��O DE EXIBI��O DO ERRO
			} // FIM DO TRY CATCH	
		}
		// M�TODO QUE VERIFICA O BOT�O DE VOLTAR DO DISPOSITIVO ANDROID E ENCERRA A APLICA��O SE PRESSIONADO 2 VEZES SEGUIDAS
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