package ejercicio2;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class CursosHeuristic {

	
	//Heuristica recomendada: coger los productos que tengan un mejor ratio score / precio
	
	public static Double heuristic(CursosVertex v1, Predicate<CursosVertex> goal, CursosVertex v2) {
        return (double) v1.remainingBudget();
    }
	

}
