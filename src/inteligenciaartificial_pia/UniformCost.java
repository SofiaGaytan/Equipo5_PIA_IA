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
public class UniformCost {
    final ArrayList<Priority> priorityQueue;

    public UniformCost() {
        this.priorityQueue = new ArrayList<>();
    }

    public Priority search(Nodo start, Nodo meta) {
        priorityQueue.add(new Priority(start, 0f, new ArrayList<>()));

        while (!priorityQueue.isEmpty()) {
            var minPriority = getMinPriority();

            if (metaReached(meta, minPriority)) {
                return minPriority;
            }

            expandChildNodes(minPriority);
            priorityQueue.remove(minPriority);
        }
        return null;
    }

    boolean metaReached(Nodo meta, Priority minPriority) {
        return minPriority.getNode() == meta;
    }

    void expandChildNodes(Priority priority) {
        for (Edge edge : priority.getNode().getEdges()) {
            priorityQueue.add(new Priority(edge.getDestination(), edge.getCost() + priority.getCost(), priority.getPath()));
        }
    }

    Priority getMinPriority() {
        Priority minCostPriority = priorityQueue.get(0);

        for (Priority priority : priorityQueue) {
            if (priority.getCost() < minCostPriority.getCost()) {
                minCostPriority = priority;
            }
        }

        return minCostPriority;
    }
}
