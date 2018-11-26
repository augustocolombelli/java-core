package br.com.core.util.collections.linkedhashset;

import java.util.function.Predicate;

public class RemoveZeroPredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		return t == 0;
	}
	
}
