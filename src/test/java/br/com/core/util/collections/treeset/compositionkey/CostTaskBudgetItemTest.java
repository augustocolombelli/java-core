package br.com.core.util.collections.treeset.compositionkey;

import java.util.SortedSet;
import java.util.TreeSet;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;
import org.hamcrest.Matcher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@SuppressWarnings("unchecked")
@RunWith(MockitoJUnitRunner.class)
public class CostTaskBudgetItemTest {

	

	@Test
	public void shouldSortByTaskNumber() {
		SortedSet<CostTaskBudgetItem> costs = new TreeSet<CostTaskBudgetItem>();
		costs.add(createCost(1, 1, 1, 1, 2));
		costs.add(createCost(1, 1, 1, 1, 1));
		costs.add(createCost(1, 1, 1, 1, 8));
		costs.add(createCost(1, 1, 1, 1, 3));
		
		assertThat(costs, 
				contains(
						getMatcherCostTaskBudgetItem(1, 1, 1, 1, 1),
						getMatcherCostTaskBudgetItem(1, 1, 1, 1, 2),
						getMatcherCostTaskBudgetItem(1, 1, 1, 1, 3),
						getMatcherCostTaskBudgetItem(1, 1, 1, 1, 8)
						
						));
	}
	
	@Test
	public void shouldSortByIntemSequentialAndTaskNumber() {
		SortedSet<CostTaskBudgetItem> costs = new TreeSet<CostTaskBudgetItem>();
		costs.add(createCost(1, 1, 1, 2, 2));
		costs.add(createCost(1, 1, 1, 1, 1));
		costs.add(createCost(1, 1, 1, 2, 4));
		costs.add(createCost(1, 1, 1, 1, 6));
		
		assertThat(costs, 
				contains(
						getMatcherCostTaskBudgetItem(1, 1, 1, 1, 1),
						getMatcherCostTaskBudgetItem(1, 1, 1, 1, 6),
						getMatcherCostTaskBudgetItem(1, 1, 1, 2, 2),
						getMatcherCostTaskBudgetItem(1, 1, 1, 2, 4)
						
						));
	}
	
	@Test
	public void shouldSortBuildingUnitBySequentialNumberAndTaskNumber() {
		SortedSet<CostTaskBudgetItem> costs = new TreeSet<CostTaskBudgetItem>();
		costs.add(createCost(1, 1, 1, 3, 8));
		costs.add(createCost(1, 1, 2, 3, 7));
		costs.add(createCost(1, 1, 3, 3, 6));
		costs.add(createCost(1, 1, 1, 2, 9));
		costs.add(createCost(1, 1, 2, 2, 8));
		costs.add(createCost(1, 1, 3, 2, 7));
		costs.add(createCost(1, 1, 1, 1, 100));
		costs.add(createCost(1, 1, 2, 1, 99));
		costs.add(createCost(1, 1, 3, 1, 98));
		
		assertThat(costs, 
				contains(
						getMatcherCostTaskBudgetItem(1, 1, 1, 1, 100),
						getMatcherCostTaskBudgetItem(1, 1, 1, 2, 9),
						getMatcherCostTaskBudgetItem(1, 1, 1, 3, 8),
						getMatcherCostTaskBudgetItem(1, 1, 2, 1, 99),
						getMatcherCostTaskBudgetItem(1, 1, 2, 2, 8),
						getMatcherCostTaskBudgetItem(1, 1, 2, 3, 7),
						getMatcherCostTaskBudgetItem(1, 1, 3, 1, 98),
						getMatcherCostTaskBudgetItem(1, 1, 3, 2, 7),
						getMatcherCostTaskBudgetItem(1, 1, 3, 3, 6)
						
						));
	}
	
	@Test
	public void shouldSortVersionNumberBuildingUnitBySequentialNumberAndTaskNumber() {
		SortedSet<CostTaskBudgetItem> costs = new TreeSet<CostTaskBudgetItem>();
		costs.add(createCost(1, 2, 1, 3, 8));
		costs.add(createCost(1, 2, 2, 3, 7));
		costs.add(createCost(1, 2, 3, 3, 6));
		costs.add(createCost(1, 2, 1, 2, 9));
		costs.add(createCost(1, 2, 2, 2, 8));
		costs.add(createCost(1, 2, 3, 2, 7));
		costs.add(createCost(1, 2, 1, 1, 100));
		costs.add(createCost(1, 2, 2, 1, 99));
		costs.add(createCost(1, 2, 3, 1, 98));
		
		costs.add(createCost(1, 3, 1, 3, 8));
		costs.add(createCost(1, 3, 2, 3, 7));
		costs.add(createCost(1, 3, 3, 3, 6));
		costs.add(createCost(1, 3, 1, 2, 9));
		costs.add(createCost(1, 3, 2, 2, 8));
		costs.add(createCost(1, 3, 3, 2, 7));
		costs.add(createCost(1, 3, 1, 1, 100));
		costs.add(createCost(1, 3, 2, 1, 99));
		costs.add(createCost(1, 3, 3, 1, 98));
		
		costs.add(createCost(1, 1, 1, 3, 8));
		costs.add(createCost(1, 1, 2, 3, 7));
		costs.add(createCost(1, 1, 3, 3, 6));
		costs.add(createCost(1, 1, 1, 2, 9));
		costs.add(createCost(1, 1, 2, 2, 8));
		costs.add(createCost(1, 1, 3, 2, 7));
		costs.add(createCost(1, 1, 1, 1, 100));
		costs.add(createCost(1, 1, 2, 1, 99));
		costs.add(createCost(1, 1, 3, 1, 98));
		
		assertThat(costs, 
				contains(
						getMatcherCostTaskBudgetItem(1, 1, 1, 1, 100),
						getMatcherCostTaskBudgetItem(1, 1, 1, 2, 9),
						getMatcherCostTaskBudgetItem(1, 1, 1, 3, 8),
						getMatcherCostTaskBudgetItem(1, 1, 2, 1, 99),
						getMatcherCostTaskBudgetItem(1, 1, 2, 2, 8),
						getMatcherCostTaskBudgetItem(1, 1, 2, 3, 7),
						getMatcherCostTaskBudgetItem(1, 1, 3, 1, 98),
						getMatcherCostTaskBudgetItem(1, 1, 3, 2, 7),
						getMatcherCostTaskBudgetItem(1, 1, 3, 3, 6),
						
						getMatcherCostTaskBudgetItem(1, 2, 1, 1, 100),
						getMatcherCostTaskBudgetItem(1, 2, 1, 2, 9),
						getMatcherCostTaskBudgetItem(1, 2, 1, 3, 8),
						getMatcherCostTaskBudgetItem(1, 2, 2, 1, 99),
						getMatcherCostTaskBudgetItem(1, 2, 2, 2, 8),
						getMatcherCostTaskBudgetItem(1, 2, 2, 3, 7),
						getMatcherCostTaskBudgetItem(1, 2, 3, 1, 98),
						getMatcherCostTaskBudgetItem(1, 2, 3, 2, 7),
						getMatcherCostTaskBudgetItem(1, 2, 3, 3, 6),
						
						getMatcherCostTaskBudgetItem(1, 3, 1, 1, 100),
						getMatcherCostTaskBudgetItem(1, 3, 1, 2, 9),
						getMatcherCostTaskBudgetItem(1, 3, 1, 3, 8),
						getMatcherCostTaskBudgetItem(1, 3, 2, 1, 99),
						getMatcherCostTaskBudgetItem(1, 3, 2, 2, 8),
						getMatcherCostTaskBudgetItem(1, 3, 2, 3, 7),
						getMatcherCostTaskBudgetItem(1, 3, 3, 1, 98),
						getMatcherCostTaskBudgetItem(1, 3, 3, 2, 7),
						getMatcherCostTaskBudgetItem(1, 3, 3, 3, 6)
						
						));
	}
	
	@Test
	public void shouldSortBuildingAndVersionNumberAndBuildingUnitBySequentialNumberAndTaskNumber() {
		SortedSet<CostTaskBudgetItem> costs = new TreeSet<CostTaskBudgetItem>();
		costs.add(createCost(2, 2, 1, 3, 8));
		costs.add(createCost(2, 2, 2, 3, 7));
		costs.add(createCost(2, 2, 3, 3, 6));
		costs.add(createCost(2, 2, 1, 2, 9));
		costs.add(createCost(2, 2, 2, 2, 8));
		costs.add(createCost(2, 2, 3, 2, 7));
		costs.add(createCost(2, 2, 1, 1, 100));
		costs.add(createCost(2, 2, 2, 1, 99));
		costs.add(createCost(2, 2, 3, 1, 98));
		costs.add(createCost(2, 3, 1, 3, 8));
		costs.add(createCost(2, 3, 2, 3, 7));
		costs.add(createCost(2, 3, 3, 3, 6));
		costs.add(createCost(2, 3, 1, 2, 9));
		costs.add(createCost(2, 3, 2, 2, 8));
		costs.add(createCost(2, 3, 3, 2, 7));
		costs.add(createCost(2, 3, 1, 1, 100));
		costs.add(createCost(2, 3, 2, 1, 99));
		costs.add(createCost(2, 3, 3, 1, 98));
		costs.add(createCost(2, 1, 1, 3, 8));
		costs.add(createCost(2, 1, 2, 3, 7));
		costs.add(createCost(2, 1, 3, 3, 6));
		costs.add(createCost(2, 1, 1, 2, 9));
		costs.add(createCost(2, 1, 2, 2, 8));
		costs.add(createCost(2, 1, 3, 2, 7));
		costs.add(createCost(2, 1, 1, 1, 100));
		costs.add(createCost(2, 1, 2, 1, 99));
		costs.add(createCost(2, 1, 3, 1, 98));
		
		costs.add(createCost(1, 2, 1, 3, 8));
		costs.add(createCost(1, 2, 2, 3, 7));
		costs.add(createCost(1, 2, 3, 3, 6));
		costs.add(createCost(1, 2, 1, 2, 9));
		costs.add(createCost(1, 2, 2, 2, 8));
		costs.add(createCost(1, 2, 3, 2, 7));
		costs.add(createCost(1, 2, 1, 1, 100));
		costs.add(createCost(1, 2, 2, 1, 99));
		costs.add(createCost(1, 2, 3, 1, 98));
		costs.add(createCost(1, 3, 1, 3, 8));
		costs.add(createCost(1, 3, 2, 3, 7));
		costs.add(createCost(1, 3, 3, 3, 6));
		costs.add(createCost(1, 3, 1, 2, 9));
		costs.add(createCost(1, 3, 2, 2, 8));
		costs.add(createCost(1, 3, 3, 2, 7));
		costs.add(createCost(1, 3, 1, 1, 100));
		costs.add(createCost(1, 3, 2, 1, 99));
		costs.add(createCost(1, 3, 3, 1, 98));
		costs.add(createCost(1, 1, 1, 3, 8));
		costs.add(createCost(1, 1, 2, 3, 7));
		costs.add(createCost(1, 1, 3, 3, 6));
		costs.add(createCost(1, 1, 1, 2, 9));
		costs.add(createCost(1, 1, 2, 2, 8));
		costs.add(createCost(1, 1, 3, 2, 7));
		costs.add(createCost(1, 1, 1, 1, 100));
		costs.add(createCost(1, 1, 2, 1, 99));
		costs.add(createCost(1, 1, 3, 1, 98));
		
		costs.add(createCost(3, 2, 1, 3, 8));
		costs.add(createCost(3, 2, 2, 3, 7));
		costs.add(createCost(3, 2, 3, 3, 6));
		costs.add(createCost(3, 2, 1, 2, 9));
		costs.add(createCost(3, 2, 2, 2, 8));
		costs.add(createCost(3, 2, 3, 2, 7));
		costs.add(createCost(3, 2, 1, 1, 100));
		costs.add(createCost(3, 2, 2, 1, 99));
		costs.add(createCost(3, 2, 3, 1, 98));
		costs.add(createCost(3, 3, 1, 3, 8));
		costs.add(createCost(3, 3, 2, 3, 7));
		costs.add(createCost(3, 3, 3, 3, 6));
		costs.add(createCost(3, 3, 1, 2, 9));
		costs.add(createCost(3, 3, 2, 2, 8));
		costs.add(createCost(3, 3, 3, 2, 7));
		costs.add(createCost(3, 3, 1, 1, 100));
		costs.add(createCost(3, 3, 2, 1, 99));
		costs.add(createCost(3, 3, 3, 1, 98));
		costs.add(createCost(3, 1, 1, 3, 8));
		costs.add(createCost(3, 1, 2, 3, 7));
		costs.add(createCost(3, 1, 3, 3, 6));
		costs.add(createCost(3, 1, 1, 2, 9));
		costs.add(createCost(3, 1, 2, 2, 8));
		costs.add(createCost(3, 1, 3, 2, 7));
		costs.add(createCost(3, 1, 1, 1, 100));
		costs.add(createCost(3, 1, 2, 1, 99));
		costs.add(createCost(3, 1, 3, 1, 98));
		
		assertThat(costs, 
				contains(
						getMatcherCostTaskBudgetItem(1, 1, 1, 1, 100),
						getMatcherCostTaskBudgetItem(1, 1, 1, 2, 9),
						getMatcherCostTaskBudgetItem(1, 1, 1, 3, 8),
						getMatcherCostTaskBudgetItem(1, 1, 2, 1, 99),
						getMatcherCostTaskBudgetItem(1, 1, 2, 2, 8),
						getMatcherCostTaskBudgetItem(1, 1, 2, 3, 7),
						getMatcherCostTaskBudgetItem(1, 1, 3, 1, 98),
						getMatcherCostTaskBudgetItem(1, 1, 3, 2, 7),
						getMatcherCostTaskBudgetItem(1, 1, 3, 3, 6),
						getMatcherCostTaskBudgetItem(1, 2, 1, 1, 100),
						getMatcherCostTaskBudgetItem(1, 2, 1, 2, 9),
						getMatcherCostTaskBudgetItem(1, 2, 1, 3, 8),
						getMatcherCostTaskBudgetItem(1, 2, 2, 1, 99),
						getMatcherCostTaskBudgetItem(1, 2, 2, 2, 8),
						getMatcherCostTaskBudgetItem(1, 2, 2, 3, 7),
						getMatcherCostTaskBudgetItem(1, 2, 3, 1, 98),
						getMatcherCostTaskBudgetItem(1, 2, 3, 2, 7),
						getMatcherCostTaskBudgetItem(1, 2, 3, 3, 6),
						getMatcherCostTaskBudgetItem(1, 3, 1, 1, 100),
						getMatcherCostTaskBudgetItem(1, 3, 1, 2, 9),
						getMatcherCostTaskBudgetItem(1, 3, 1, 3, 8),
						getMatcherCostTaskBudgetItem(1, 3, 2, 1, 99),
						getMatcherCostTaskBudgetItem(1, 3, 2, 2, 8),
						getMatcherCostTaskBudgetItem(1, 3, 2, 3, 7),
						getMatcherCostTaskBudgetItem(1, 3, 3, 1, 98),
						getMatcherCostTaskBudgetItem(1, 3, 3, 2, 7),
						getMatcherCostTaskBudgetItem(1, 3, 3, 3, 6),
						
						getMatcherCostTaskBudgetItem(2, 1, 1, 1, 100),
						getMatcherCostTaskBudgetItem(2, 1, 1, 2, 9),
						getMatcherCostTaskBudgetItem(2, 1, 1, 3, 8),
						getMatcherCostTaskBudgetItem(2, 1, 2, 1, 99),
						getMatcherCostTaskBudgetItem(2, 1, 2, 2, 8),
						getMatcherCostTaskBudgetItem(2, 1, 2, 3, 7),
						getMatcherCostTaskBudgetItem(2, 1, 3, 1, 98),
						getMatcherCostTaskBudgetItem(2, 1, 3, 2, 7),
						getMatcherCostTaskBudgetItem(2, 1, 3, 3, 6),
						getMatcherCostTaskBudgetItem(2, 2, 1, 1, 100),
						getMatcherCostTaskBudgetItem(2, 2, 1, 2, 9),
						getMatcherCostTaskBudgetItem(2, 2, 1, 3, 8),
						getMatcherCostTaskBudgetItem(2, 2, 2, 1, 99),
						getMatcherCostTaskBudgetItem(2, 2, 2, 2, 8),
						getMatcherCostTaskBudgetItem(2, 2, 2, 3, 7),
						getMatcherCostTaskBudgetItem(2, 2, 3, 1, 98),
						getMatcherCostTaskBudgetItem(2, 2, 3, 2, 7),
						getMatcherCostTaskBudgetItem(2, 2, 3, 3, 6),
						getMatcherCostTaskBudgetItem(2, 3, 1, 1, 100),
						getMatcherCostTaskBudgetItem(2, 3, 1, 2, 9),
						getMatcherCostTaskBudgetItem(2, 3, 1, 3, 8),
						getMatcherCostTaskBudgetItem(2, 3, 2, 1, 99),
						getMatcherCostTaskBudgetItem(2, 3, 2, 2, 8),
						getMatcherCostTaskBudgetItem(2, 3, 2, 3, 7),
						getMatcherCostTaskBudgetItem(2, 3, 3, 1, 98),
						getMatcherCostTaskBudgetItem(2, 3, 3, 2, 7),
						getMatcherCostTaskBudgetItem(2, 3, 3, 3, 6),
						
						getMatcherCostTaskBudgetItem(3, 1, 1, 1, 100),
						getMatcherCostTaskBudgetItem(3, 1, 1, 2, 9),
						getMatcherCostTaskBudgetItem(3, 1, 1, 3, 8),
						getMatcherCostTaskBudgetItem(3, 1, 2, 1, 99),
						getMatcherCostTaskBudgetItem(3, 1, 2, 2, 8),
						getMatcherCostTaskBudgetItem(3, 1, 2, 3, 7),
						getMatcherCostTaskBudgetItem(3, 1, 3, 1, 98),
						getMatcherCostTaskBudgetItem(3, 1, 3, 2, 7),
						getMatcherCostTaskBudgetItem(3, 1, 3, 3, 6),
						getMatcherCostTaskBudgetItem(3, 2, 1, 1, 100),
						getMatcherCostTaskBudgetItem(3, 2, 1, 2, 9),
						getMatcherCostTaskBudgetItem(3, 2, 1, 3, 8),
						getMatcherCostTaskBudgetItem(3, 2, 2, 1, 99),
						getMatcherCostTaskBudgetItem(3, 2, 2, 2, 8),
						getMatcherCostTaskBudgetItem(3, 2, 2, 3, 7),
						getMatcherCostTaskBudgetItem(3, 2, 3, 1, 98),
						getMatcherCostTaskBudgetItem(3, 2, 3, 2, 7),
						getMatcherCostTaskBudgetItem(3, 2, 3, 3, 6),
						getMatcherCostTaskBudgetItem(3, 3, 1, 1, 100),
						getMatcherCostTaskBudgetItem(3, 3, 1, 2, 9),
						getMatcherCostTaskBudgetItem(3, 3, 1, 3, 8),
						getMatcherCostTaskBudgetItem(3, 3, 2, 1, 99),
						getMatcherCostTaskBudgetItem(3, 3, 2, 2, 8),
						getMatcherCostTaskBudgetItem(3, 3, 2, 3, 7),
						getMatcherCostTaskBudgetItem(3, 3, 3, 1, 98),
						getMatcherCostTaskBudgetItem(3, 3, 3, 2, 7),
						getMatcherCostTaskBudgetItem(3, 3, 3, 3, 6)
						
						));
	}
	
	
	private CostTaskBudgetItem createCost(Integer buildingId, Integer versionNumber, Integer buildingUnit, Integer budgetItemsequentialNumber, Integer taskNumber) {
		CostTaskBudgetItem costTaskByBudgetItem = new CostTaskBudgetItem();
		costTaskByBudgetItem.setBuildingId(buildingId);
		costTaskByBudgetItem.setVersionNumber(versionNumber);
		costTaskByBudgetItem.setBuildingUnit(buildingUnit);
		costTaskByBudgetItem.setBudgetItemsequentialNumber(budgetItemsequentialNumber);
		costTaskByBudgetItem.setTaskNumber(taskNumber);
		return costTaskByBudgetItem;
	}
	
	private Matcher<CostTaskBudgetItem> getMatcherCostTaskBudgetItem(Integer buildingId, Integer versionNumber, Integer buildingUnit, Integer budgetItemsequentialNumber, Integer taskNumber) {
		return allOf(
			hasProperty("buildingId", equalTo(buildingId)),
			hasProperty("versionNumber", equalTo(versionNumber)),
			hasProperty("buildingUnit", equalTo(buildingUnit)),
			hasProperty("budgetItemsequentialNumber", equalTo(budgetItemsequentialNumber)),
			hasProperty("taskNumber", equalTo(taskNumber))
		);
	}
	
	

}
