import java.util.Scanner;

public class MonitoramentoLaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double CargaProjeto = 15.0;
        double LimiteSeguranca = CargaProjeto * 0.8;

        System.out.println("--- Sistema SafeBuild: Monitoramento de Carga ---");
        System.out.print("Digite a leitura atual do sensor (kN/m2): ");
        double CargaAtual = sc.nextDouble();

        if (CargaAtual < LimiteSeguranca) {
            System.out.println("Status: VERDE");
            System.out.println("Decisão: Operação normal. Carga dentro dos parâmetros de segurança.");
        } else if (CargaAtual  >= LimiteSeguranca && CargaAtual <= CargaProjeto) {
         System.out.println("Status: AMARELO (ALERTA)");
         System.out.println("Decisão: Reduzir velocidade de cocretagem e evacuar pessoal não essencial.");
        } else {
            System.out.println("Status: VERMELHO (CRÍTICO)");
            System.out.println("Decisão: INTERROMPER IMEDIATAMENTE! Risco de colapso das escoras.");
        }

        if (CargaAtual > (CargaProjeto * 1.2)) {
            System.out.println("ALERTA ADICIONAL: Possível falha catastrófica iminente. Evacuar área total.");
        }

        sc.close();
    }
}
