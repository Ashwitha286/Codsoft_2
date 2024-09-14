{
  "nbformat": 4,
  "nbformat_minor": 0,
  "metadata": {
    "colab": {
      "provenance": [],
      "authorship_tag": "ABX9TyPUwbZYupqiYBX9CcVjCTCn",
      "include_colab_link": true
    },
    "kernelspec": {
      "name": "python3",
      "display_name": "Python 3"
    },
    "language_info": {
      "name": "python"
    }
  },
  "cells": [
    {
      "cell_type": "markdown",
      "metadata": {
        "id": "view-in-github",
        "colab_type": "text"
      },
      "source": [
        "<a href=\"https://colab.research.google.com/github/Ashwitha286/Codsoft_2/blob/main/MarksCalculator.java\" target=\"_parent\"><img src=\"https://colab.research.google.com/assets/colab-badge.svg\" alt=\"Open In Colab\"/></a>"
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "import java.util.Scanner;\n",
        "class MarksCalculator {\n",
        "\n",
        "      public static void main(String[] args)\n",
        "      {\n",
        "      Scanner scanner = new Scanner(System.in);\n",
        "      System.out.print(\"Enter the number of subjects: \");\n",
        "      int numSubjects = scanner.nextInt();\n",
        "      int[] marks = new int[numSubjects];\n",
        "      int totalMarks = 0;\n",
        "      for (int i = 0; i < numSubjects; i++)\n",
        "       {\n",
        "          System.out.print(\"Enter marks obtained in subject \" + (i + 1) + \" (out of 100): \");\n",
        "          marks[i] = scanner.nextInt();\n",
        "          totalMarks += marks[i];\n",
        "      }\n",
        "      double averagePercentage = (double) totalMarks / numSubjects;\n",
        "      char grade;\n",
        "      if (averagePercentage >= 90)\n",
        "       {\n",
        "          grade = 'A';\n",
        "      }\n",
        "      else if (averagePercentage >= 80)\n",
        "      {\n",
        "          grade = 'B';\n",
        "      }\n",
        "      else if (averagePercentage >= 70)\n",
        "      {\n",
        "          grade = 'C';\n",
        "      }\n",
        "      else if (averagePercentage >= 60)\n",
        "      {\n",
        "          grade = 'D';\n",
        "      }\n",
        "      else\n",
        "       {\n",
        "          grade = 'F';\n",
        "      }\n",
        "\n",
        "      System.out.println(\"\\n--- Results ---\");\n",
        "      System.out.println(\"Total Marks: \" + totalMarks);\n",
        "      System.out.println(\"Average Percentage: \" + averagePercentage + \"%\");\n",
        "      System.out.println(\"Grade: \" + grade);\n",
        "\n",
        "      scanner.close();\n",
        "    }\n",
        "}\n",
        "\n",
        "\n"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/",
          "height": 106
        },
        "id": "gjgv0HWKNxVw",
        "outputId": "f461f255-302f-47b2-9543-97645b170dd9"
      },
      "execution_count": null,
      "outputs": [
        {
          "output_type": "error",
          "ename": "SyntaxError",
          "evalue": "invalid syntax (<ipython-input-6-370e7edde84c>, line 2)",
          "traceback": [
            "\u001b[0;36m  File \u001b[0;32m\"<ipython-input-6-370e7edde84c>\"\u001b[0;36m, line \u001b[0;32m2\u001b[0m\n\u001b[0;31m    class MarksCalculator {\u001b[0m\n\u001b[0m                          ^\u001b[0m\n\u001b[0;31mSyntaxError\u001b[0m\u001b[0;31m:\u001b[0m invalid syntax\n"
          ]
        }
      ]
    }
  ]
}