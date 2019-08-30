package br.com.core.util.collections.treeset.compositionkey;

import java.math.BigDecimal;

public class CostTaskBudgetItem implements Comparable<CostTaskBudgetItem>{

	private Integer buildingId;
	private Integer versionNumber;
	private Integer buildingUnit;
	private Integer budgetItemsequentialNumber;
	private Integer taskNumber;
	private BigDecimal percentage;

	public Integer getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(Integer buildingId) {
		this.buildingId = buildingId;
	}

	public Integer getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(Integer versionNumber) {
		this.versionNumber = versionNumber;
	}

	public Integer getBuildingUnit() {
		return buildingUnit;
	}

	public void setBuildingUnit(Integer buildingUnit) {
		this.buildingUnit = buildingUnit;
	}

	public Integer getBudgetItemsequentialNumber() {
		return budgetItemsequentialNumber;
	}

	public void setBudgetItemsequentialNumber(Integer budgetItemsequentialNumber) {
		this.budgetItemsequentialNumber = budgetItemsequentialNumber;
	}

	public Integer getTaskNumber() {
		return taskNumber;
	}

	public void setTaskNumber(Integer taskNumber) {
		this.taskNumber = taskNumber;
	}

	public BigDecimal getPercentage() {
		return percentage;
	}

	public void setPercentage(BigDecimal percentage) {
		this.percentage = percentage;
	}

	@Override
	public int compareTo(CostTaskBudgetItem o) {
		int retorno = this.getBuildingId().compareTo(o.getBuildingId());

		if (retorno == 0) {
			retorno = this.getVersionNumber().compareTo(o.getVersionNumber());
		}

		if (retorno == 0) {
			retorno = this.getBuildingUnit().compareTo(o.getBuildingUnit());
		}

		if (retorno == 0) {
			retorno = this.getBudgetItemsequentialNumber().compareTo(o.getBudgetItemsequentialNumber());
		}

		if (retorno == 0) {
			retorno = this.getTaskNumber().compareTo(o.getTaskNumber());
		}
		return retorno;
	}

	@Override
	public String toString() {
		return "CostTaskBudgetItem [buildingId=" + buildingId + ", versionNumber=" + versionNumber + ", buildingUnit="
				+ buildingUnit + ", budgetItemsequentialNumber=" + budgetItemsequentialNumber + ", taskNumber="
				+ taskNumber + ", percentage=" + percentage + "]";
	}

}
