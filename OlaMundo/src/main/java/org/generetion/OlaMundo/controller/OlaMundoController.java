package org.generetion.OlaMundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Indica para o Spring que o codigo a baixo vai ser um controller, ou um controlador da nossa api
@RestController

//Indica o endpoint da nossa classe controladora
@RequestMapping("/helo")
public class OlaMundoController {

	@GetMapping
	public String hello() {
		return "Ola Mundoooo!!";
	}

	@GetMapping("/bsm")
	public String BSM() {
		return "Persistencia";
	}

	@GetMapping("/bsm2")
	public String BSM2() {
		return "Responsabilidade Pessoal";
	}

	@GetMapping("/bsm3")
	public String BSM3() {
		return "Comunicação";
	}

	@GetMapping("/bsm4")
	public String BSM4() {
		return "Orientação ao Futuro";
	}

	@GetMapping("/bsm5")
	public String BSM5() {
		return "Orientação ao Detalhe";
	}

	@GetMapping("/bsm6")
	public String BSM6() {
		return "Proatividade";
	}

	@GetMapping("/bsm7")
	public String BSM7() {
		return "Trabalho em Equipe";
	}

	@GetMapping("/bsmAmelhorar")
	public String BMS_OPCIONAL() {
		return "Essa semana vou trabalhar bastante a minha proatividade"
				+ " e a orientação aos detalhes";
	}
}