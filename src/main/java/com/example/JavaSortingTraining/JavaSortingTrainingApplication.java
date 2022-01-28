package com.example.JavaSortingTraining;

import com.example.JavaSortingTraining.model.Pokemon;
//import com.example.JavaSortingTraining.model.Trainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class JavaSortingTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSortingTrainingApplication.class, args);
		List<Pokemon> pokemonList = new ArrayList<Pokemon>();
		Pokemon yadoking = new Pokemon("yadoking",220,0);
		Pokemon mugenDaina = new Pokemon("mugen-daina",340,270);
		Pokemon zigzagma = new Pokemon("zigzagma",60,30);
		Pokemon blucky = new Pokemon("blucky",310,170);
		Pokemon fireBird = new Pokemon("fireBird",220,190);
		pokemonList.add(zigzagma);
		pokemonList.add(mugenDaina);
		pokemonList.add(blucky);

		Comparator<Pokemon> hpComparator = Comparator.comparing(Pokemon::getHP);
		//逆にしたい時は.reversed()
		Comparator<Pokemon> reverseHPComparator = Comparator.comparing(Pokemon::getHP).reversed();

		List<Pokemon> sortedPokemonsByHP = pokemonList.stream()
				// ここで比較ルール設定
				.sorted(reverseHPComparator)
				.collect(Collectors.toList());
		System.out.print(sortedPokemonsByHP);
	}

}
