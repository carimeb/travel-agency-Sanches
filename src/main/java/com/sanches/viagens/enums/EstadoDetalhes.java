package com.sanches.viagens.enums;

import com.sanches.viagens.rest.EstadoDetalhesResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum EstadoDetalhes {

    SAO_PAULO("São Paulo", "46 289 333", "São Paulo"),
    MINAS_GERAIS("Minas Gerais", "21 292 666", "Ouro Preto"),
    RIO_DE_JANEIRO("Rio de Janeiro", "17 366 189", "Rio Janeiro"),
    BAHIA("Bahia", "14 930 634", "Salvador"),
    PARANA("Paraná", "11 516 840", "Curitiba"),
    RIO_GRANDE_DO_SUL("Rio Grande do Sul", "11 422 973", "Porto Alegre"),
    PERNAMBUCO("Pernambuco", "9 616 621", "Recife"),
    CEARA("Ceará", "9 187 103", "Aracati"),
    PARA("Pará", "8 690 745", "Belém"),
    SANTA_CATARINA("Santa Catarina", "7 252 502", "Florianópolis"),
    MARANHAO("Maranhão", "7 114 598", "São Luís"),
    GOIAS("Goiás", "7 113 540", "Caldas Novas"),
    AMAZONAS("Amazonas", "4 207 714", "Manaus"),
    ESPIRITO_SANTO("Espírito Santo", "4 064 052", "Vila Velha"),
    PARAIBA("Paraíba", "4 039 277", "Campina Grande"),
    RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "3 534 165", "Maracajaú"),
    MATO_GROSSO("Mato Grosso", "3 526 220", "Cuiabá"),
    ALAGOAS("Alagoas", "3 351 543", "Maragogi"),
    PIAUI("Piauí", "3 281 480", "Teresina"),
    DISTRITO_FEDERAL("Distrito Federal", "3 055 149", "Brasília"),
    MATO_GROSSO_DO_SUL("Mato Grosso do Sul", "2 809 394", "Corumbá"),
    SERGIPE("Sergipe", "2 318 822", "Aracajú"),
    RONDONIA("Rondônia", "1 796 460", "Porto Velho"),
    TOCANTINS("Tocantins", "1 590 248", "Palmas"),
    ACRE("Acre", "894 470", "Rio Branco"),
    AMAPA("Amapá", "861 773", "Oiapoque"),
    RORAIMA("Roraima", "631 181", "Alto alegre");

    private final String estado;
    private final String populacao;
    private final String cidadeMaisFamosa;

    public static EstadoDetalhesResponse responseOf(String estado) {

        try {
            EstadoDetalhes estadoDetalhes = valueOf(estado);
            return new EstadoDetalhesResponse("",
                    estadoDetalhes.getEstado(),
                    estadoDetalhes.getPopulacao(),
                    estadoDetalhes.getCidadeMaisFamosa());
        } catch (IllegalArgumentException ex) {
            return new EstadoDetalhesResponse("Estado não encontrado");
        }
    }

}
