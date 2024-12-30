package Arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class ArquivosTxt {

	public static void main(String[] args) throws IOException {
		
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		
		pessoa1.setNome("Vitor Carvalho");
		pessoa1.setEmail("vitim.crv@gmail.com");
		pessoa1.setIdade(18);

		pessoa2.setNome("Luis Jaciuk");
		pessoa2.setEmail("luis.crv@gmail.com");
		pessoa2.setIdade(18);
		
		pessoa3.setNome("Severo Snape");
		pessoa3.setEmail("severo.crv@gmail.com");
		pessoa3.setIdade(48);

		
		List<Pessoa> pessoas= new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);


		File arquivo = new File("C:\\Users\\Usuario\\eclipse-workspace\\TxtExcelJSON\\arquivo.csv");

		if (!arquivo.exists()) {
			arquivo.createNewFile();

		}

		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		for (Pessoa p : pessoas) {
			 escrever_no_arquivo.write(p.getNome() + ";" + p.getEmail()+ ";" + p.getIdade()+ "\n");
		}
		
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
	}

}
