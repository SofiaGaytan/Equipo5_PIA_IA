/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inteligenciaartificial_pia;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class AStar extends UniformCost{
     public AStar() {
        super();
    }

    @Override
    public Priority search(Nodo start, Nodo meta) {
        priorityQueue.add(new Priority(start, 0f, new ArrayList<>()));

        while (!priorityQueue.isEmpty()) {
            var minPriority = getMinPriority();

            for (Priority priority: priorityQueue) {
                if (priority.getNode() == meta) {
                    return priority;
                }
            }

            expandChildNodes(minPriority);
            priorityQueue.remove(minPriority);
        }
        return null;
    }

    @Override
    public Priority getMinPriority() {
        Priority minCostPriority = priorityQueue.get(0);

        for (Priority priority : priorityQueue) {
            var priorityWeight = priority.getCost() + priority.getNode().getHeuristic();
            var minCostPriorityWeight = minCostPriority.getCost() + minCostPriority.getNode().getHeuristic();

            if (priorityWeight < minCostPriorityWeight) {
                minCostPriority = priority;
            }
        }

        return minCostPriority;
    }
}
