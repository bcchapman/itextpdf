package com.lowagie.text.pdf.codec.postscript.commands;

import com.lowagie.text.pdf.codec.postscript.PACommand;
import com.lowagie.text.pdf.codec.postscript.PAContext;
import com.lowagie.text.pdf.codec.postscript.PainterException;
import com.lowagie.text.pdf.codec.postscript.interfaces.*;

/**
 *
 * <p>Title: arcn</p>
 *
 * <p>Description: x y r angle1 angle2 arc -</p>
 *
 * <p>Copyright: Copyright (c) 2007</p>
 *
 * <p>Company: </p>
 *
 * @author Carsten Hammer
 * @version 1.0
 */
public class arcn
    implements PACommand, IQuinaryExecute, IPSLevel1 {
  public arcn() {
    super();
  }

  public void execute(PAContext context) throws PainterException {
    Number data[];
    data = context.popNumberOperands(6);
    this.execute(context, data[0], data[1], data[2], data[3], data[4]);
  }

  public void execute(PAContext context, Object operand1, Object operand2,
                      Object operand3, Object operand4, Object operand5) throws
      PainterException {
    this.execute(context, (Number) operand1, (Number) operand2,
                 (Number) operand3, (Number) operand4, (Number) operand5);
  }

  public void execute(PAContext context, Number operand1, Number operand2,
                      Number operand3, Number operand4, Number operand5) throws
      PainterException {
    context.pencil.arcn(operand1.doubleValue(), operand2.doubleValue(),
                        operand3.doubleValue(), operand4.doubleValue(),
                        operand5.doubleValue());
  }
}
