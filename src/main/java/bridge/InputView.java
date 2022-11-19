package bridge;

import camp.nextstep.edu.missionutils.Console;

import static Constant.BridgeConstant.MIN_SIZE;
import static Constant.BridgeConstant.MAX_SIZE;
import static Constant.BridgeInput.MOVE_CHOICE;
import static Constant.BridgeInput.GAME_RESTART;
import static Constant.PrintText.*;
import static Constant.ErrorMessage.*;
/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        String input;
        while(!isDigit(input=Console.readLine())){

        }
        return 0;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }

    private void testInput(String input){

    }
    private boolean isDigit(String input){
        try{
            Integer.parseInt(input);
            return true;
        }
        catch (Exception e){
            System.out.println(INVALID_DIGIT.getErrorMsg());
            return false;
        }
    }
    private Integer convertToInteger(String input){
        return 0;
    }
    private void testVaildRange(){

    }
}
