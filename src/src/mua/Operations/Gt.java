package src.mua.Operations;

import src.mua.MuaStack;
import src.mua.Value.Value;
import src.mua.Value.ValueFactory;

import java.util.ArrayList;

public class Gt implements Operation {
	@Override
	public int argNumber() {
		return 2;
	}

	@Override
	public Value execute(ArrayList<Value> args, MuaStack caller) {
		Value ret = ValueFactory.compare(args.get(0), args.get(1), '>');
		return ret;
	}
}
