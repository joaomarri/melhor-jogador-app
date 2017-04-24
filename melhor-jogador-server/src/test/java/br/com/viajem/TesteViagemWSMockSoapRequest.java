package br.com.viajem;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;

import org.junit.Before;
import org.junit.Test;

import br.com.viagem.client.ViagemWSClient;
import br.com.viagem.model.Viagem;
import br.com.viagem.schema.Aereo;
import br.com.viagem.schema.AereoSeguimento;
import br.com.viagem.schema.Aereos;
import br.com.viagem.schema.Passageiros;
import br.com.viagem.schema.PesquisarSolicitacaoResponse;
import br.com.viagem.schema.ResultadoAcao;
import br.com.viagem.schema.Solicitacao;
import br.com.viagem.util.ConvertUtil;

public class TesteViagemWSMockSoapRequest {

	private ViagemWSClient viagemWSClient;
	private PesquisarSolicitacaoResponse response;
	private ConvertUtil convertUtil ;
	
	@Before
	public void setUp() {
		convertUtil = new ConvertUtil();
		
		Solicitacao solicitacao = new Solicitacao();
		solicitacao.setIdSolicitacao(3546);
		solicitacao.setPassageiros(new Passageiros());
		Aereo aereo = new Aereo();
		AereoSeguimento aereoSeguimento = new AereoSeguimento();
		aereoSeguimento.setCidadeOrigem("Sao Paulo");
		aereoSeguimento.setCidadeDestino("Berlim");
		
		aereo.getAereoSeguimento().add(aereoSeguimento);
		solicitacao.setAereos(new Aereos());
		solicitacao.getAereos().getAereo().add(aereo);
		
		response = new PesquisarSolicitacaoResponse();
		response.setResultadoAcao(ResultadoAcao.SUCESSO);
		response.setNumeroSolicitacoes(1);
		response.getSolicitacao().add(solicitacao);
	}
	
	@Test
	public void mockSoapResquestConsultaSolicitacoesViagem() throws DatatypeConfigurationException {
		viagemWSClient = mock(ViagemWSClient.class);
		
		when(viagemWSClient.consultaViagensUltimos3Meses()).thenReturn(response);
		
		PesquisarSolicitacaoResponse r = viagemWSClient.consultaViagensUltimos3Meses();
		assertNotNull(r);
		List<Viagem> viagens = convertUtil.responseToViagensModel(r);
		assertNotNull(viagens);
	}

}
