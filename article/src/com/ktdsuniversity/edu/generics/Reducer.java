package com.ktdsuniversity.edu.generics;

public interface Reducer<INPUT, OUTPUT> {
	
	OUTPUT reduce(INPUT input, OUTPUT output); // input 주면 output 주겠다는 뜻
}
