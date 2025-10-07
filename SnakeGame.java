
import java.util.Random;
import java.util.Scanner;

public class SnakeGame 
{
  private static final int GRID_SIZE = 10;
    private static final char EMPTY = '.';
    private static final char SNAKE_HEAD = 'H';
    private static final char SNAKE_BODY = 'b';
    private static final char FOOD = '*';
    
     private MyArrayListHM<Point> snake;
    private Point food;
    private String direction = "UP";
    private int score = 0;
    private boolean gameOver = false;
    private Random rand = new Random();
    private Scanner scanner = new Scanner(System.in);
    
    public SnakeGame() {
        snake = new MyArrayListHM<>();
        resetGame();
    }

    private void resetGame() {
        snake.clear();
        int center = GRID_SIZE / 2;
        snake.add(0, new Point(center, center));
        score = 0;
        gameOver = false;
        direction = "UP";
        placeFood();
    }
    private void placeFood() {
        while (true) {
            int x = rand.nextInt(GRID_SIZE);
            int y = rand.nextInt(GRID_SIZE);
            Point p = new Point(x, y);
            if (!snakeContains(p)) {
                food = p;
                break;
            }
        }
    }
    private boolean snakeContains(Point p) {
        for (int i = 0; i < snake.getSize(); i++) {
            if (snake.get(i).equals(p)) {
                return true;
            }
        }
        return false;
    }
        private void printGrid() {
        for (int y = 0; y < GRID_SIZE; y++) {
            for (int x = 0; x < GRID_SIZE; x++) {
                Point p = new Point(x, y);
                if (snake.get(0).equals(p)) {
                    System.out.print(SNAKE_HEAD);
                } else if (snakeContains(p)) {
                    System.out.print(SNAKE_BODY);
                } else if (food.equals(p)) {
                    System.out.print(FOOD);
                } else {
                    System.out.print(EMPTY);
                }
            }
            System.out.println();
        }

    System.out.println("Score: " + score);
    }

    private void moveSnake() {
        Point head = snake.get(0);
         int newX = head.getX();
    int newY = head.getY();
        
        switch (direction) {
            case "UP": newY--; break;
            case "DOWN": newY++; break;
            case "LEFT": newX--; break;
            case "RIGHT": newX++; break;
        }
        
            if (newX < 0) newX = GRID_SIZE - 1;
        if (newX >= GRID_SIZE) newX = 0;
        if (newY < 0) newY = GRID_SIZE - 1;
        if (newY >= GRID_SIZE) newY = 0;
        
        Point newHead = new Point(newX, newY); 
        
         if (snakeContains(newHead)) {
            gameOver = true;
            return;
        }
        snake.add(0, newHead);
        
         if (newHead.equals(food)) {
            score++;
            placeFood();
        } else {
            
            snake.remove(snake.getSize() - 1);
        }
    }
     private void getUserInput() {
        System.out.print("Move (WASD): ");
        String input = scanner.nextLine().trim().toUpperCase();
        if (input.equals("W") && !direction.equals("DOWN")) direction = "UP";
        else if (input.equals("S") && !direction.equals("UP")) direction = "DOWN";
        else if (input.equals("A") && !direction.equals("RIGHT")) direction = "LEFT";
        else if (input.equals("D") && !direction.equals("LEFT")) direction = "RIGHT";
    }

    public void start() {
        while (true) {
            printGrid();
            getUserInput();
            moveSnake();

            if (gameOver) {
                System.out.println("Game Over! Final Score: " + score);
                System.out.print("Play again? (Y/N): ");
                String choice = scanner.nextLine().trim().toUpperCase();
                if (choice.equals("Y")) {
                    resetGame();
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        SnakeGame game = new SnakeGame();
        game.start();
    }
    

}