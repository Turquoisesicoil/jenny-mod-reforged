#pragma once
#include <vector>
#include <queue>

namespace JennyAI {

    struct Node {
        int x, y, z;
        float gCost, hCost;
        float fCost() const { return gCost + hCost; }
    };

    class Pathfinder {
    public:
        Pathfinder(int gridSize);
        ~Pathfinder();

        // Calculate path from start to end avoiding obstacles
        std::vector<Node> calculatePath(Node start, Node end, const std::vector<bool>& obstacles);

    private:
        int size;
        std::priority_queue<Node> openList;
        std::vector<bool> closedList;
        
        float calculateHeuristic(Node a, Node b);
    };
}
