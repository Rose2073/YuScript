/*
  This Java File is Created By Rose
 */
package com.rose.yuscript.tree;

/**
 * @author Rose
 *
 */
public class YuIfTree implements YuNode {

	private YuConditionalExpression condition;
	
	private YuCodeBlock codeBlock;
	
	private YuCodeBlock fallbackCodeBlock;
	
	@Override
	public <T, R> R accept(YuTreeVisitor<R, T> visitor, T value) {
		return visitor.visitIfTree(this, value);
	}
	
	/**
	 * @param codeBlock the codeBlock to set
	 */
	public void setCodeBlock(YuCodeBlock codeBlock) {
		this.codeBlock = codeBlock;
	}
	
	/**
	 * @return the codeBlock
	 */
	public YuCodeBlock getCodeBlock() {
		return codeBlock;
	}
	
	/**
	 * @param condition the condition to set
	 */
	public void setCondition(YuConditionalExpression condition) {
		this.condition = condition;
	}
	
	/**
	 * @return the condition
	 */
	public YuConditionalExpression getCondition() {
		return condition;
	}
	
	/**
	 * @return the fallbackCodeBlock
	 */
	public YuCodeBlock getFallbackCodeBlock() {
		return fallbackCodeBlock;
	}
	
	/**
	 * @param fallbackCodeBlock the fallbackCodeBlock to set
	 */
	public void setFallbackCodeBlock(YuCodeBlock fallbackCodeBlock) {
		this.fallbackCodeBlock = fallbackCodeBlock;
	}

}
