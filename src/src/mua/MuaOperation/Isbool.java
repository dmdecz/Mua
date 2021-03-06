package src.mua.MuaOperation;

import src.mua.MuaStack;
import src.mua.MuaValue.MuaBool;
import src.mua.MuaValue.MuaValue;

import java.util.ArrayList;

public class Isbool implements MuaOperation {
	@Override
	public int argNumber() {
		return 1;
	}

	@Override
	public MuaValue execute(ArrayList<MuaValue> args, MuaStack caller) {
		return new MuaBool(args.get(0) instanceof MuaBool);
	}
}
